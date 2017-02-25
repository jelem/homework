package com.hillel.brackets;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BracketsTest {

  Brackets brackets;
  String sentence;

  @Test
  public void checkFirstTest() {
    sentence = "((({}()[])))";
    brackets = new Brackets(sentence);
    assertThat(brackets.check(), is(true));
  }

  @Test
  public void checkSecondTest() {
    sentence = "(({)})";
    brackets = new Brackets(sentence);
    assertThat(brackets.check(), is(false));
  }

  @Test
  public void checkThirdTest() {
    sentence = "{({})}";
    brackets = new Brackets(sentence);
    assertThat(brackets.check(), is(true));
  }


}
