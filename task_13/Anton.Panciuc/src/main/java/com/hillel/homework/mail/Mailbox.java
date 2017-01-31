<<<<<<< HEAD
package com.hillel.homework.mail;


import java.util.ArrayList;


public class Mailbox {
  private ArrayList<Message> inbox;
  private ArrayList<Message> send;
  static final String MY_EMAIL = "mail@mail.com";

  public Mailbox() {
    inbox = new ArrayList<Message>();
    send = new ArrayList<Message>();
  }

  public int getInboxCount() {

    return inbox.size();
  }

  public Message getLastInbox() {

    return inbox.get(inbox.size() - 1);
  }

  public Message getLastSend() {
    return send.get(send.size() - 1);

  }

  public int getSendCount() {

    return send.size();
  }

  public void receiveLetter(Message letter) {
    letter.setReceiver(MY_EMAIL);
    inbox.add(letter);
  }

  public void sendLetter(Message newLetter) {
    send.add(newLetter);
  }
}
=======
package com.hillel.homework.mail;


import java.util.ArrayList;


public class Mailbox {
  private ArrayList<Message> inbox;
  private ArrayList<Message> send;
  static final String MY_EMAIL = "mail@mail.com";

  public Mailbox() {
    inbox = new ArrayList<Message>();
    send = new ArrayList<Message>();
  }

  public int getInboxCount() {

    return inbox.size();
  }

  public Message getLastInbox() {

    return inbox.get(inbox.size() - 1);
  }

  public Message getLastSend() {
    return send.get(send.size() - 1);

  }

  public int getSendCount() {

    return send.size();
  }

  public void receiveLetter(Message letter) {
    letter.setReceiver(MY_EMAIL);
    inbox.add(letter);
  }

  public void sendLetter(Message newLetter) {
    send.add(newLetter);
  }
}
>>>>>>> c2ac787eb4428b5f077ad39949f5e2969611fa2e
