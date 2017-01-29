package com.hillel.homework.mail;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MailboxTest {
  Mailbox mailbox;

  @Before
  public void setUp() {
    mailbox = new Mailbox();
  }

  @Test
  public void receiveLetterTest() {
    mailbox.receiveLetter(new Message(mailbox.MY_EMAIL, "mailTest@mail.com","Test message"));
    assertEquals(1, mailbox.getInboxCount());
    assertEquals("mail@mail.com\n" +
        "mailTest@mail.com\n" +
        "Test message", mailbox.getLastInbox().toString());
  }

  @Test
  public void sendLetterTest() {
    mailbox.sendLetter(new Message("mailTest@mail.com", mailbox.MY_EMAIL,"New test message"));
    assertEquals(1, mailbox.getSendCount());
    assertEquals(0, mailbox.getInboxCount());
    assertEquals("mailTest@mail.com\n" +
        "mail@mail.com\n" +
        "New test message", mailbox.getLastSend().toString());
  }
}
