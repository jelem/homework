package com.hillel.mailbox;

public class Mail {

  private String text;
  private String subject;
  private String mailFrom;

  public Mail(String text, String subject, String mailFrom) {
    this.text = text;
    this.subject = subject;
    this.mailFrom = mailFrom;
  }

  public Mail() {
    this.text = "Empty";
    this.subject = "No subject";
    this.mailFrom = "";
  }

  @Override
  public String toString() {
    return "Mail from - " + mailFrom + " Mail Subject - " + subject + " Text - " + text;
  }
}
