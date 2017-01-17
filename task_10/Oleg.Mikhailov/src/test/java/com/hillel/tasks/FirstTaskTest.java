package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FirstTaskTest {

  StringTasks tasks;

  @Before
  public void setUp() {
    tasks = new StringTasks();
  }

  @Test
  public void testReplace() {
    String email = "mikhailov.m.o@gmail.com";
    assertThat(tasks.replaceEmail(email), is("mikhailov[ dot ]m[ dot ]o[ at ]gmail[ dot ]com"));
  }

  @Test
  public void testShortWords() {
    String sentence = "    internationalization localization cat elephant monitor   ";
    assertThat(tasks.shortenWords(sentence), is("i18n l10n cat e6t m5r"));
  }

  @Test
  public void testCountPalindrom() {
    String words = "deleveled, evitative, cat, dog, deified";
    assertThat(tasks.countPalindromes(words), is(3));
  }

  @Test
  public void testBinaryToDecimal() {
    String number = "1000110";
    assertThat(tasks.binaryToDecimal(number), is(70));
  }
}