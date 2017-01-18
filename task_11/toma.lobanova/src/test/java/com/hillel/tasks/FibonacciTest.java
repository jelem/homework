package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {
  private Fibonacci fibonacci;
  private int input = 20;
  private int actualResult;
  private int expectedResult = 6765;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void iterativeTest() {
    actualResult = fibonacci.iterative(input);
    assertThat(actualResult, is(expectedResult));
  }

  @Test
  public void recursiveTest() {
    actualResult = fibonacci.recursive(input);
    assertThat(actualResult, is(expectedResult));
  }
}
