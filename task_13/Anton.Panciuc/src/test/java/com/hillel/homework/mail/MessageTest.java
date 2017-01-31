package com.hillel.homework.mail;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageTest {
  Message letter;

  @Before
  public void setUp() {
    letter = new Message();
  }

  @Test
  public void testSetReceiver() {
    letter.setReceiver("test@mail.com");
    String result = letter.getReceiver();
    assertEquals("test@mail.com", result);
    letter.setReceiver(null);
    result = letter.getReceiver();
    assertEquals(letter.DEFAULT, result);
  }

  @Test
  public void testSetSender() {
    letter.setSender("testTwo@mail.com");
    String result = letter.getSender();
    assertEquals("testTwo@mail.com", result);
    letter.setSender(null);
    result = letter.getSender();
    assertEquals(letter.DEFAULT, result);
  }

  @Test
  public void testMessage() {
    letter.setMessage("Test message");
    String result = letter.getMessage();
    assertEquals("Test message", result);
    letter.setMessage(null);
    result = letter.getMessage();
    assertEquals(letter.DEFAULT, result);
    letter.setMessage("");
    result = letter.getMessage();
    assertEquals("", result);
  }

  @Test
  public void testToString() {
    letter.setReceiver("receiver@mail.com");
    letter.setSender("sender@mail.com");
    letter.setMessage("Test toString message");
    assertEquals("receiver@mail.com\n" + "sender@mail.com\n"
        + "Test toString message", letter.toString());
  }
}
