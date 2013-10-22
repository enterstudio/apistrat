package models

case class EventStatus (
  yesCount: Option[Int],// Number of people confirmed to attend

  maybeCount: Option[Int],// Number of people who may attend

  noCount: Option[Int],// Number of people who cannot attend

  invitedCount: Option[Int]// Total number of people invited

  )

