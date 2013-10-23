package com.wordnik.client.model;

public class EventStatus {
  /* Number of people confirmed to attend */
  private Integer yesCount = null;
  /* Number of people who may attend */
  private Integer maybeCount = null;
  /* Number of people who cannot attend */
  private Integer noCount = null;
  /* Total number of people invited */
  private Integer invitedCount = null;
  public Integer getYesCount() {
    return yesCount;
  }
  public void setYesCount(Integer yesCount) {
    this.yesCount = yesCount;
  }

  public Integer getMaybeCount() {
    return maybeCount;
  }
  public void setMaybeCount(Integer maybeCount) {
    this.maybeCount = maybeCount;
  }

  public Integer getNoCount() {
    return noCount;
  }
  public void setNoCount(Integer noCount) {
    this.noCount = noCount;
  }

  public Integer getInvitedCount() {
    return invitedCount;
  }
  public void setInvitedCount(Integer invitedCount) {
    this.invitedCount = invitedCount;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventStatus {\n");
    sb.append("  yesCount: ").append(yesCount).append("\n");
    sb.append("  maybeCount: ").append(maybeCount).append("\n");
    sb.append("  noCount: ").append(noCount).append("\n");
    sb.append("  invitedCount: ").append(invitedCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

