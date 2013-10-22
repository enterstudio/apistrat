package apis

import models.Event
import models.EventStatus
import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }

import scala.collection.JavaConverters._

class EventsApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "EventsApi"
  override protected val applicationName: Option[String] = Some("events")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }


  val addEventOperation = (apiOperation[Event]("addEvent")
      summary "adds a new event"
      parameters(
        bodyParam[Event]("body").description(""))
  )

  post("/",operation(addEventOperation)) {
    val body = parsedBody.extract[Event]
    println("body: " + body)
  }



  val findEventByIdOperation = (apiOperation[Event]("findEventById")
      summary "looks up an event by ID"
      parameters(
        pathParam[Long]("eventId").description(""))
  )

  get("/:eventId",operation(findEventByIdOperation)) {
    val eventId = params.getOrElse("eventId", halt(400))
    println("eventId: " + eventId)
  }



  val deleteEventOperation = (apiOperation[Event]("deleteEvent")
      summary "Removes an event"
      parameters(
        pathParam[Long]("eventId").description(""))
  )

  delete("/:eventId",operation(deleteEventOperation)) {
    val eventId = params.getOrElse("eventId", halt(400))
    println("eventId: " + eventId)
  }



  val getEventStatusOperation = (apiOperation[EventStatus]("getEventStatus")
      summary "gets the attendee status of the event"
      parameters(
        pathParam[Long]("eventId").description(""))
  )

  get("/:eventId/status",operation(getEventStatusOperation)) {
    val eventId = params.getOrElse("eventId", halt(400))
    println("eventId: " + eventId)
  }

}
