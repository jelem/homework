package com.hillel.mailbox;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestMailBox {

  MailBox mailBox;
  Mail mail;

  @Before
  public void setUp() {
    mailBox = new MailBox();
    mail = new Mail("Robot test", "test", "robotest.mail.ru");
  }

  @Test
  public void testSendEmail() {
    mailBox.sendEmail(mail);
    assertThat(mailBox.readSentMail(1),
        is("Mail from - robotest.mail.ru Mail Subject - test Text - Robot test"));
  }

  @Test
  public void testIncomEmail() {

    mailBox.incomEmail(mail);
    assertThat(mailBox.readIncomMail(1),
        is("Mail from - robotest.mail.ru Mail Subject - test Text - Robot test"));
  }

  @Test
  public void testGetIncomMails() {
    mailBox.incomEmail(mail);
    assertThat(mailBox.getIncomMails(), is(1));
  }

  @Test
  public void testGetSentMails() {
    mailBox.sendEmail(mail);
    assertThat(mailBox.getSentMailsInBox(), is(1));
  }

}
