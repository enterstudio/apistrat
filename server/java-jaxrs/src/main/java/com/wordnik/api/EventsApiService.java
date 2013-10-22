package com.wordnik.api;

import com.wordnik.model.*;

public class EventsApiService {
  public static Event addEvent(Event body) {
    return body;
  }

  public static Event findEventById(Long eventId) {
    Event event = new Event();

    event.setId(123);
    event.setName("Sample event");
    event.setStartDate(new java.util.Date());
    event.setMaxAttendees(100);

    return event;
  }

  public static ApiResponseMessage deleteEvent(Long eventId) {
    return new ApiResponseMessage(ApiResponseMessage.OK, "event deleted");
  }

  public static EventStatus getEventStatus(Long eventId) {
    EventStatus status = new EventStatus();

    status.setYesCount(100);
    status.setMaybeCount(25);
    status.setNoCount(3);
    status.setInvitedCount(150);

    return status;
  }
}
