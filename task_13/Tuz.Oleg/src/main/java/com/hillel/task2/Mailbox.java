package com.hillel.task2;


import java.util.Arrays;

public class Mailbox {
  private Latters[] sent;
  private Latters[] received;
  private int counterSent;
  private int counterReceived;
  public static final int MAX_LATTERS = 50;

  public Mailbox() {
    this.counterSent = 0;
    this.counterReceived = 0;
    this.sent = new Latters[MAX_LATTERS];
    this.received = new Latters[MAX_LATTERS];
  }

  public void addSentLatters(Latters latters) {
    if (counterSent == MAX_LATTERS) {
      System.out.println("Mailbox is full");
    } else {
      this.sent[counterSent] = latters;
      counterSent++;
    }
  }

  public void subSentLatters(Latters latters) {
    if (counterSent == 0) {
      System.out.println("Mailbox is empty");
    } else {
      this.sent[counterSent] = null;
      counterSent--;
    }
  }

  public void addReceivedLatters(Latters latters) {
    if (counterReceived == MAX_LATTERS) {
      System.out.println("Mailbox is full");
    } else {
      this.received[counterReceived] = latters;
      counterReceived++;
    }
  }

  public void subReceivedLatters(Latters latters) {
    if (counterReceived == 0) {
      System.out.println("Mailbox is empty");
    } else {
      this.sent[counterReceived] = null;
      counterReceived--;
    }
  }

  public int getCounterSent() {
    return counterSent;
  }

  public int getCounterReceived() {
    return counterReceived;
  }

  public int getMaxLatters() {
    return MAX_LATTERS;
  }

  public String viewSentLatters() {
    return Arrays.toString(sent);
  }
  public String viewReceivedLatters() {
    return Arrays.toString(received);
  }

}
