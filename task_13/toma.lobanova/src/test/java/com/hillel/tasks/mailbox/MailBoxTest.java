package com.hillel.tasks.mailbox;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MailBoxTest {
  MailBox mailBox;

  @Before
  public void setUp() {
    mailBox = new MailBox();
  }

  @Test
  public void recieveLetterTest() {
    mailBox.recieveLetter(new Letter(mailBox.MY_EMAIL, "anna@gmail.com", null,
        null, "Meet me at 2 pm tommorrow"));
    assertThat(mailBox.getInboxCount(), is(1));
    assertThat(mailBox.getLastInboxLetter().toString(), is(equalTo("tomatoma@ya.ru\n" +
        "anna@gmail.com\nunspecified\nunspecified\nMeet me at 2 pm tommorrow")));
  }

  @Test
  public void sendLetterTest() {
    mailBox.sendLetter(new Letter("anna@gmail.com", mailBox.MY_EMAIL, null,
        null, "See you tomorrow"));
    assertThat(mailBox.getOutboxCount(), is(1));
    assertThat(mailBox.getInboxCount(), is(0));
    assertThat(mailBox.getLastOutboxLetter().toString(), is(equalTo("anna@gmail.com\n" +
        "tomatoma@ya.ru\nunspecified\nunspecified\nSee you tomorrow")));
  }
}
