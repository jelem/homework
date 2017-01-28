package com.hillel.tasks.mailbox;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class LetterTest {
  Letter letter;

  @Before
  public void setUp() {
    letter = new Letter();
  }

  @Test
  public void testTo() {
    letter.setTo("ivan@gmail.com");
    String result = letter.getTo();
    assertThat(result, is(equalTo("ivan@gmail.com")));
    letter.setTo(null);
    result = letter.getTo();
    assertThat(result, is(equalTo(letter.UNSET)));
    letter.setTo("");
    result = letter.getTo();
    assertThat(result, is(equalTo(letter.UNSET)));
  }

  @Test
  public void testFrom() {
    letter.setFrom("katie@yahoo.com");
    String result = letter.getFrom();
    assertThat(result, is(equalTo("katie@yahoo.com")));
    letter.setFrom(null);
    result = letter.getFrom();
    assertThat(result, is(equalTo(letter.UNSET)));
    letter.setFrom("");
    result = letter.getFrom();
    assertThat(result, is(equalTo(letter.UNSET)));
  }

  @Test
  public void testCopy() {
    letter.setCopy("vladimir@mail.ru");
    String result = letter.getCopy();
    assertThat(result, is(equalTo("vladimir@mail.ru")));
    letter.setCopy(null);
    result = letter.getCopy();
    assertThat(result, is(equalTo(letter.UNSET)));
    letter.setCopy("");
    result = letter.getCopy();
    assertThat(result, is(equalTo(letter.UNSET)));
  }

  @Test
  public void testBlindCopy() {
    letter.setBlindCopy("somebody@yandex.ru");
    String result = letter.getBlindCopy();
    assertThat(result, is("somebody@yandex.ru"));
    letter.setBlindCopy(null);
    result = letter.getBlindCopy();
    assertThat(result, is(letter.UNSET));
    letter.setBlindCopy("");
    result = letter.getBlindCopy();
    assertThat(result, is(letter.UNSET));
  }

  @Test
  public void testMessage() {
    letter.setMessage("I want to send a letter");
    String result = letter.getMessage();
    assertThat(result, is("I want to send a letter"));
    letter.setMessage(null);
    result = letter.getMessage();
    assertThat(result, is(letter.UNSET));
    letter.setMessage("");
    result = letter.getMessage();
    assertThat(result, is(""));
  }

  @Test
  public void testToString() {
    letter.setTo("annie@mail.ru");
    letter.setFrom("tomatoma@ya.ru");
    letter.setMessage("Have you seen this new tv show about gangsters?");
    assertThat(letter.toString(), is(equalTo("annie@mail.ru\n" +
        "tomatoma@ya.ru\nunspecified\nunspecified\nHave you seen this new tv show about gangsters?")));
  }
}
