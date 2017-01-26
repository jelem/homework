package com.hillel.java.tasks.mail;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestMailBox {

  Message message;
  MailBox mailBox;

  @Before
  public void setUp() {
    message = new Message("Max", 2);
    mailBox = new MailBox();
  }

  @Test
  public void testAddInput() {
    mailBox.getInputMessages(message);
    assertThat(mailBox.getCountInput(), is(1));
    assertThat(mailBox.getFirstInput(), is(message));
  }

  @Test
  public void testDeleteInput() {
    mailBox.getInputMessages(message);
    mailBox.getInputMessages(message);
    mailBox.getInputMessages(message);
    mailBox.deleteInputMessages();
    assertThat(mailBox.getCountInput(), is(2));
  }

  @Test
  public void testEmptyInput() {
    mailBox.deleteInputMessages();
    mailBox.deleteInputMessages();
    assertThat(mailBox.getCountInput(), is(0));
  }

  @Test
  public void testLimitInput() {
    int count = mailBox.getMaxMessage();
    for (int i = 0; i <= count + 1; i++) {
      mailBox.getInputMessages(message);
    }
    assertThat(mailBox.getCountInput(), is(100));
  }
}
