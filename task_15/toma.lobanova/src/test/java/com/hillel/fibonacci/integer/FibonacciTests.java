package com.hillel.fibonacci.integer;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FibonacciTests {
  Fibonacci fibonacci;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void fibonacciFindNumberTest() {
    assertThat(fibonacci.findNumber(1), is(1));
    assertThat(fibonacci.findNumber(2), is(1));
    assertThat(fibonacci.findNumber(5), is(5));
    assertThat(fibonacci.findNumber(21), is(10946));
  }

  @Test
  public void fibonacciIsElementInCacheTest() {
    assertThat(fibonacci.findNumber(21), is(10946));
    assertThat(fibonacci.isNumberInCache(21), is(true));
    assertThat(fibonacci.isNumberInCache(22), is(false));
  }

  @Test(expected = IllegalArgumentException.class)
  public void fibonacciThrowingExceptionsTest() {
    fibonacci.findNumber(-5);
  }
}

