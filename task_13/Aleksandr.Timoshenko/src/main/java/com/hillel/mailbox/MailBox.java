package com.hillel.mailbox;

public class MailBox {

  public static final int MAX_IN_BOX = 20;
  private Mail[] sentMail;
  private Mail[] incomMail;
  private int incomMailsInBox;
  private int sentMailsInBox;

  public MailBox() {
    sentMail = new Mail[MAX_IN_BOX];
    incomMail = new Mail[MAX_IN_BOX];
    incomMailsInBox = 0;
    sentMailsInBox = 0;
  }

  public void sendEmail(Mail mail) {
    if (sentMailsInBox + incomMailsInBox <= MAX_IN_BOX) {
      sentMail[sentMailsInBox] = mail;
      sentMailsInBox++;
    } else {
      System.out.println("Mail Box Full");
    }
  }

  public int getIncomMails() {
    return incomMailsInBox;
  }

  public int getSentMailsInBox() {
    return sentMailsInBox;
  }

  public void incomEmail(Mail mail) {
    if (incomMailsInBox + sentMailsInBox <= MAX_IN_BOX) {
      incomMail[incomMailsInBox] = mail;
      incomMailsInBox++;
    } else {
      System.out.println("Mail Box Full");
    }
  }

  public String readSentMail(int num) {
    if (sentMailsInBox < num - 1 & num - 1 < 0) {
      System.out.println("You did not send such a Mail.");
      return "";
    }
    return sentMail[num - 1].toString();
  }

  public String readIncomMail(int num) {
    if (incomMailsInBox < num - 1 & num - 1 < 0) {
      System.out.println("You did not receiv such a Mail.");
      return null;
    }
    return incomMail[num - 1].toString();
  }
}
