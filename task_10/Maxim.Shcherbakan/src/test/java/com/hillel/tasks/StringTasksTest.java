package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringTasksTest {

  StringTasks stringTasks;

  @Before
  public void setUp() {
    this.stringTasks = new StringTasks();
  }

  @Test
  public void testReplaceEmail() {
    String result = stringTasks.replaceEmail("test@gmail.com");
    assertThat("test[ at ]gmail[ dot ]com", is(result));
  }

  @Test
  public void testShortWords() {
    String result = stringTasks
        .shortenWords("internationalization localization cat elephant monitor");
    assertThat("i18n l10n cat e6t m5r", is(result));
  }

  @Test
  public void testPalindromes() {
    int result = stringTasks.countPalindromes("deleveled, evitative, cat, dog, deified");
    assertThat(3, is(result));
  }

  @Test
  public void testBinaryDecimal() {
    int result = stringTasks.binaryToDecimal("1100");
    assertThat(12, is(result));
  }
}
