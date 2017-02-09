package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringTasksTest {

  StringTasks task1;
  StringTasks task2;
  StringTasks task3;
  StringTasks task4;

  @Before
  public void setUp() {
    task1 = new StringTasks();
    task2 = new StringTasks();
    task3 = new StringTasks();
    task4 = new StringTasks();
  }

  @Test
  public void replaceEmailTest() {
    String email = "person@gmail.com";
    assertThat(task1.replaceEmail(email), is("person[at]gmail[dot]com"));
  }

  @Test
  public void shortenWordsTest() {
    String sentence = "internationalization localization cat elephant monitor";
    assertThat(task2.shortenWords(sentence), is("i18n l10n cat e6t m5r"));
  }

  @Test
  public void countPalindromesTest() {
    String words = "deleveled, evitative, cat, dog, deified";
    assertThat(task3.countPalindromes(words), is(3));
  }

  @Test
  public void binaryToDecimalTest() {
    String number = "1100";
    assertThat(task4.binaryToDecimal(number), is(12));
  }

}
