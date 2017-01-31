package com.hillel.mail;

public class Mail {

  private static final int MAX_LETTERS = 10;
  private Letter[] inbox;
  private Letter[] outbox;
  private int counterInbox;
  private int counterOutbox;

  public Mail() {
    this.inbox = new Letter[MAX_LETTERS];
    this.outbox = new Letter[MAX_LETTERS];
    this.counterInbox = 0;
    this.counterOutbox = 0;
  }

  public void addInboxLetter(Letter letter) {
    if (counterInbox == MAX_LETTERS) {
      System.out.println("Mail Full");
    } else {
      this.inbox[counterInbox] = letter;
      counterInbox++;
    }
  }

  public void removeInboxLetter() {
    if (counterInbox == 0) {
      System.out.println("Mail empty");
    } else {
      this.inbox[counterInbox] = null;
      counterInbox--;
    }
  }

  public void addOutboxLetter(Letter letter) {
    if (counterOutbox == MAX_LETTERS) {
      System.out.println("Mail Full");
    } else {
      this.outbox[counterOutbox] = letter;
      counterOutbox++;
    }
  }

  public void removeOutboxLetter() {
    if (counterOutbox == 0) {
      System.out.println("Mail empty");
    } else {
      this.outbox[counterOutbox] = null;
      counterOutbox--;
    }
  }

  public int getCounterInbox() {
    return counterInbox;
  }

  public int getCounterOutbox() {
    return counterOutbox;
  }
}
