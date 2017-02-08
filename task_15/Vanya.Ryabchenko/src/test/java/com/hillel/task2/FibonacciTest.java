package com.hillel.task2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

  Fibonacci fibonacci;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void fibonacciFirstTest() {
    BigInteger result = BigInteger.ONE;
    assertThat(fibonacci.fibonacciNumber(1), is(result));
  }

  @Test
  public void fibonacciSecondTest() {
    BigInteger result = BigInteger.ONE;
    assertThat(fibonacci.fibonacciNumber(2), is(result));
  }

  @Test
  public void fibonacciThirdTest() {
    BigInteger result = BigInteger.valueOf(5);
    assertThat(fibonacci.fibonacciNumber(5), is(result));
  }


}
