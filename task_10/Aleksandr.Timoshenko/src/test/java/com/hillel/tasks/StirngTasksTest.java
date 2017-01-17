package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class StirngTasksTest {

  StringTasks stringTasks;

  @Before
  public void setUp() {
    stringTasks = new StringTasks();
  }

  @Test
  public void replaceEmailTest() {
    String email = "person@gmail.com";
    assertThat(stringTasks.replaceEmail(email), is("person[ at ]gmail[ dot ]com"));
  }

  @Test
  public void shortenWordsTest() {
    String str = "internationalization localization cat elephant monitor";
    assertThat(stringTasks.shortenWords(str), is("i18n l10n cat e6t m5r"));

  }

  @Test
  public void countPalindromesTest() {
    String words = "deleveled, evitative, cat, dog, deified";
    assertThat(stringTasks.countPalindromes(words), is(3));
  }

  @Test
  public void binaryToDecimaTest() {
    String number = "1100";
    assertThat(stringTasks.binaryToDecimal(number), is(12));
  }

}
