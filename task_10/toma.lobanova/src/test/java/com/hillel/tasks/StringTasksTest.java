package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class StringTasksTest {
  StringTasks stringTask;

  @Before
  public void setUp() {
    stringTask = new StringTasks();
  }

  @Test
  public void replaceEmailTestInputNull() {
    String result = stringTask.replaceEmail(null);
    assertThat(result, is(equalTo(null)));
  }

  @Test
  public void replaceEmailTestInput() {
    String actualResult = stringTask.replaceEmail("toma.lobanova@yahoo.com.ua");
    String result = "toma[ dot ]lobanova[ at ]yahoo[ dot ]com[ dot ]ua";
    assertThat(actualResult, is(equalTo(result)));
  }

  @Test
  public void shortenWordsTestNull() {
    String result = stringTask.shortenWords(null);
    assertThat(result, is(equalTo(null)));
  }

  @Test
  public void shortenWordsTest() {
    String result = stringTask.shortenWords("Internationalization Localization Cat elephant monitor");
    assertThat(result, is(equalTo("i18n l10n cat e6t m5r")));
  }

  @Test
  public void countPalindromesTestNull() {
    int result = stringTask.countPalindromes(null);
    assertThat(result, is(0));
  }

  @Test
  public void countPalindromesTestEmpty() {
    int result = stringTask.countPalindromes("");
    assertThat(result, is(0));
  }

  @Test
  public void countPalindromesTest() {
    int result = stringTask.countPalindromes("deleveled, evitative, cat, dog, deified");
    assertThat(result, is(3));
  }

  @Test
  public void binaryToDecimalTestNull() {
    int result = stringTask.binaryToDecimal(null);
    assertThat(result, is(0));
  }

  @Test
  public void binaryToDecimalTestEmpty() {
    int result = stringTask.countPalindromes("");
    assertThat(result, is(0));
  }

  @Test
  public void binaryToDecimalTest() {
    int result = stringTask.binaryToDecimal("1100");
    assertThat(result, is(12));
  }
}
