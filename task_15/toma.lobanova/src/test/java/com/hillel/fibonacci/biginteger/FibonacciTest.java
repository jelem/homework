package com.hillel.fibonacci.biginteger;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FibonacciTest {
  Fibonacci fibonacci;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void fibonacciFindNumberTest() {
    assertThat(fibonacci.findNumber(1), is(equalTo(BigInteger.ONE)));
    assertThat(fibonacci.findNumber(2), is(equalTo(BigInteger.ONE)));
    assertThat(fibonacci.findNumber(5), is(equalTo(BigInteger.valueOf(5))));
    assertThat(fibonacci.findNumber(21), is(equalTo(BigInteger.valueOf(10946))));
  }

  @Test
  public void fibonacciIsElementInCacheTest() {
    assertThat(fibonacci.findNumber(21), is(equalTo(BigInteger.valueOf(10946))));
    assertThat(fibonacci.isNumberInCache(21), is(true));
    assertThat(fibonacci.isNumberInCache(22), is(false));
  }

  @Test(expected = IllegalArgumentException.class)
  public void fibonacciThrowingExceptionsTest() {
    fibonacci.findNumber(-5);
  }
}

