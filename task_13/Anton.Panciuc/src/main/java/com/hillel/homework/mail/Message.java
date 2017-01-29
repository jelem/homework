package com.hillel.homework.mail;


public class Message {
  static final String DEFAULT = "unknown";
  private String receiver;
  private String sender;
  private String message;

  public Message(String to, String from, String message) {
    setReceiver(to);
    setSender(from);
    setMessage(message);
  }

  public void setReceiver(String receiver) {
    if (receiver != null) {
      this.receiver = receiver;
    } else {
      this.receiver = DEFAULT;
    }
  }

  public void setSender(String sender) {
    if (sender != null) {
      this.sender = sender;
    } else {
      this.sender = DEFAULT;
    }
  }

  public void setMessage(String message) {
    if (message != null) {
      this.message = message;
    } else {
      this.message = DEFAULT;
    }
  }

  public Message() {
    this(DEFAULT, DEFAULT, DEFAULT);
  }

  public String getReceiver() {
    return receiver;
  }

  public String getSender() {
    return sender;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public String toString() {
    return receiver + '\n' + sender + '\n' + message;
  }
}
