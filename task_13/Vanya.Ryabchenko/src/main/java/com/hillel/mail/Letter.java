package com.hillel.mail;

public class Letter {

  private String sender;
  private String content;


  public Letter(String sender, String content) {
    this.sender = sender;
    this.content = content;
  }

  public String getSender() {
    return sender;
  }

  public String getContent() {
    return content;
  }

  @Override
  public String toString() {
    return "Letter{"
        +
        "sender='" + sender + '\''
        +
        ", content='" + content + '\''
        +
        '}';
  }
}
