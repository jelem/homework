package com.hillel.task2;


import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestMailbox {
  Latters latters;
  Mailbox mailbox;

  @Before
  public void setUp() {
    latters = new Latters("Oleg", 1, "Hello");
    mailbox = new Mailbox();
  }

  @Test
  public void testaddSentLatters() {
    mailbox.addSentLatters(latters);
    assertThat(mailbox.getCounterSent(), is(1));
  }

  @Test
  public void testsubSentLatters() {
    mailbox.subReceivedLatters(latters);
    assertThat(mailbox.getCounterSent(), is(0));
  }

  @Test
  public void testaddReceivedLatters() {
    mailbox.addReceivedLatters(latters);
    assertThat(mailbox.getCounterReceived(), is(1));
  }

  @Test
  public void testsubReceivedtLatters() {
    mailbox.subReceivedLatters(latters);
    assertThat(mailbox.getCounterReceived(), is(0));
  }


}
