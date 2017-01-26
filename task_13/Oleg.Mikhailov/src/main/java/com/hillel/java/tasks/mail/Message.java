package com.hillel.java.tasks.mail;

public class Message {

  private String name;
  private int page;


  public Message(String name, int page) {
    this.name = name;
    this.page = page;
  }

  public Message() {
    this.name = "Name";
    this.page = 0;
  }

  @Override
  public String toString() {
    return "Sender-" + name + ": page-" + page;
  }
}
