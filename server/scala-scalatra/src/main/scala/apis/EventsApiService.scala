package apis

import models._

import java.util.Date
import scala.collection.mutable.HashMap

object EventsApiService {
  val events = HashMap[Long, Event](
    1L -> Event(Some(1), Some("a friendly event"), Some(new Date()), Some(100)),
    2L -> Event(Some(2), Some("an unfriendly event"), Some(new Date()), Some(25)),
    3L -> Event(Some(3), Some("a mystery event"), Some(new Date()), Some(75))
  )

  def addEvent(event: Event) = {
    if(events.contains(event.id.get))
      ApiResponse(400, "an event with that ID already exists!")
    else {
      events += event.id.get.toLong -> event
      event
    }
  }

  def findEventById(eventId: Long) = {
    events.getOrElse(eventId, ApiResponse(400, "that event doesn't exist!"))      
  }

  def deleteEvent(eventId: Long) = {
    events.remove(eventId)
  }

  def getEventStatus(eventId: Long) = {
    events.contains(eventId) match {
      case true => EventStatus(Some(1), Some(23), Some(13), Some(98))
      case false => EventStatus(None, None, None, None)
    }
  }
}
