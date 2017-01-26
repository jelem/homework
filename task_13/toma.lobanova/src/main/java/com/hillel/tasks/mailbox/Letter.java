package com.hillel.tasks.mailbox;

public class Letter {
  static final String UNSET = "unspecified";
  private String to;
  private String from;
  private String copy;
  private String blindCopy;
  private String message;

  public Letter(String to, String from, String copy, String blindCopy, String message) {
    setTo(to);
    setFrom(from);
    setCopy(copy);
    setBlindCopy(blindCopy);
    setMessage(message);
  }

  public Letter() {
    this(UNSET, UNSET, UNSET, UNSET, UNSET);
  }

  public String getTo() {
    return to;
  }

  public String getFrom() {
    return from;
  }

  public String getCopy() {
    return copy;
  }

  public String getBlindCopy() {
    return blindCopy;
  }

  public String getMessage() {
    return message;
  }

  public void setTo(String to) {
    if (to != null && !to.isEmpty()) {
      this.to = to;
    } else {
      this.to = UNSET;
    }
  }

  public void setFrom(String from) {
    if (from != null && !from.isEmpty()) {
      this.from = from;
    } else {
      this.from = UNSET;
    }
  }

  public void setCopy(String copy) {
    if (copy != null && !copy.isEmpty()) {
      this.copy = copy;
    } else {
      this.copy = UNSET;
    }
  }

  public void setBlindCopy(String blindCopy) {
    if (blindCopy != null && !blindCopy.isEmpty()) {
      this.blindCopy = blindCopy;
    } else {
      this.blindCopy = UNSET;
    }
  }

  public void setMessage(String message) {
    if (message != null) {
      this.message = message;
    } else {
      this.message = UNSET;
    }
  }

  @Override
  public String toString() {
    return to + '\n' + from + '\n' + copy + '\n' + blindCopy + '\n' + message;
  }
}
