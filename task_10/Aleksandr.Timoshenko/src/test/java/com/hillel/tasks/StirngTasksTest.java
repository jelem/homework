package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import com.hillel.tasks.StringTasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StirngTasksTest {

  StringTasks tasks;

  @Before
  public void setUp() {
    tasks = new StringTasks();
  }

  @Test
  public void replaceEmailTest() {
    String email = "person@gmail.com";
    assertThat(tasks.replaceEmail(email), is("person[ at ]gmail[ dot ]com"));
  }

  @Test
  public void shortenWordsTest() {
    String str = "internationalization localization cat elephant monitor";
    assertThat(tasks.shortenWords(str), is("i18n l10n cat e6t m5r"));

  }

  @Test
  public void countPalindromesTest() {
    String words = "deleveled, evitative, cat, dog, deified";
    assertThat(tasks.countPalindromes(words), is(3));
  }

  @Test
  public void binaryToDecimaTest() {
    String number = "1100";
    assertThat(tasks.binaryToDecimal(number), is(12));
  }

}
