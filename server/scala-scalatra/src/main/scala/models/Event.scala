package models

import java.util.Date
case class Event (
  id: Option[Int],// Unique identifier for the event

  name: Option[String],// Friendly name for the event

  startDate: Option[Date],// Date &amp; Time that the event begins

  maxAttendees: Option[Int]// number of people who can attend

  )

