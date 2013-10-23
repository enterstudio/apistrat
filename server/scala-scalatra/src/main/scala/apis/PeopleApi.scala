package apis

import models.Person
import models.ApiResponse

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }

import scala.collection.JavaConverters._

class PeopleApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "PeopleApi"
  override protected val applicationName: Option[String] = Some("people")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }


  val findPersonByIdOperation = (apiOperation[Person]("findPersonById")
      summary "looks up a person by ID"
      parameters(
        pathParam[Long]("personId").description(""))
  )

  get("/:personId",operation(findPersonByIdOperation)) {
    val personId: Long = params.getAs[Long]("personId").getOrElse(halt(400))
ApiResponse(200, "you called PeopleApiService.findPersonById(personId)")
    
  }

}
