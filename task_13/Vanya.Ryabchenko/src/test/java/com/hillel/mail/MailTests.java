package com.hillel.mail;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MailTests {

  Mail myMail;
  Letter letter1;
  Letter letter2;

  @Before
  public void setUp() {
    myMail = new Mail();
    letter1 = new Letter("John", "Hello my friend");
    letter2 = new Letter("Vasilisa", "I write you from USA");
  }

  @Test
  public void addInboxLetterTest1() {
    myMail.addInboxLetter(letter1);
    myMail.addInboxLetter(letter2);
    assertThat(myMail.getCounterInbox(), is(2));
  }

  @Test
  public void addInboxLetterTest2() {
    for (int i = 0; i < 6; i++) {
      myMail.addInboxLetter(letter1);
      myMail.addInboxLetter(letter2);
    }
    assertThat(myMail.getCounterInbox(), is(10));
  }

  @Test
  public void addOutboxLetterTest1() {
    myMail.addOutboxLetter(letter1);
    myMail.addOutboxLetter(letter2);
    assertThat(myMail.getCounterOutbox(), is(2));
  }

  @Test
  public void addOutboxLetterTest2() {
    for (int i = 0; i < 6; i++) {
      myMail.addOutboxLetter(letter1);
      myMail.addOutboxLetter(letter2);
    }
    assertThat(myMail.getCounterOutbox(), is(10));
  }

  @Test
  public void removeInboxLetter1() {
    myMail.addInboxLetter(letter1);
    myMail.addInboxLetter(letter2);
    myMail.removeInboxLetter();
    assertThat(myMail.getCounterInbox(), is(1));
  }

  @Test
  public void removeInboxLetter2() {
    myMail.addInboxLetter(letter1);
    myMail.addInboxLetter(letter2);
    for (int i = 0; i < 4; i++) {
      myMail.removeInboxLetter();
    }
    assertThat(myMail.getCounterInbox(), is(0));
  }

  @Test
  public void removeOutboxLetter1() {
    myMail.addOutboxLetter(letter1);
    myMail.addOutboxLetter(letter2);
    myMail.removeOutboxLetter();
    assertThat(myMail.getCounterOutbox(), is(1));
  }

  @Test
  public void removeOutboxLetter2() {
    myMail.addOutboxLetter(letter1);
    myMail.addOutboxLetter(letter2);
    for (int i = 0; i < 4; i++) {
      myMail.removeOutboxLetter();
    }
    assertThat(myMail.getCounterOutbox(), is(0));
  }
}
