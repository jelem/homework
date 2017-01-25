package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciTest {
  Fibonacci fibonacci;
  static int element = 12;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }


  @Test
  public void iterativeTest() {
    assertThat(fibonacci.iterative(element), is(144));
  }

  @Test
  public void recursiveTest() {
    assertThat(fibonacci.recursive(element), is(144));
  }

}
