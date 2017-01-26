package com.hillel.tasks.mailbox;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
  private List<Letter> inbox;
  private List<Letter> outbox;
  static final String MY_EMAIL = "tomatoma@ya.ru";

  public MailBox() {
    inbox = new ArrayList<Letter>();
    outbox = new ArrayList<Letter>();
  }

  public int getInboxCount() {
    return inbox.size();
  }

  public Letter getLastInboxLetter() {
    return inbox.get(inbox.size() - 1);
  }

  public Letter getLastOutboxLetter() {
    return outbox.get(outbox.size() - 1);
  }

  public int getOutboxCount() {
    return outbox.size();
  }

  public void recieveLetter(Letter letter) {
    letter.setTo(MY_EMAIL);
    inbox.add(letter);
  }

  public void sendLetter(Letter newLetter) {
    outbox.add(newLetter);
  }
}
