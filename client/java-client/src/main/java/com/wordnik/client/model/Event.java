package com.wordnik.client.model;

import java.util.Date;
public class Event {
  /* Unique identifier for the event */
  private Integer id = null;
  /* Friendly name for the event */
  private String name = null;
  /* Date & Time that the event begins */
  private Date startDate = null;
  /* number of people who can attend */
  private Integer maxAttendees = null;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Integer getMaxAttendees() {
    return maxAttendees;
  }
  public void setMaxAttendees(Integer maxAttendees) {
    this.maxAttendees = maxAttendees;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  maxAttendees: ").append(maxAttendees).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

