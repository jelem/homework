package com.hillel.tasks.one;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

  Main stack;

  @Before
  public void seetUp() {
    stack = new Main();
  }

  @Test
  public void testOne() {
    assertThat(stack.chackString("((({}()[])))"), is(true));
  }

  @Test
  public void testToo() {
    assertThat(stack.chackString("(({)})"), is(false));
  }

  @Test
  public void testThree() {
    assertThat(stack.chackString("{([])}"), is(true));
  }

}
