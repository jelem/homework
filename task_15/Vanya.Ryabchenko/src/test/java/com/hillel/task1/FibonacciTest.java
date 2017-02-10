package com.hillel.task1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
    Integer result = 1;
    assertThat(fibonacci.fibonacciNumber(1), is(result));
  }


  @Test
  public void fibonacciSecondTest() {
    Integer result = 1;
    assertThat(fibonacci.fibonacciNumber(2), is(result));
  }

  @Test
  public void fibonacciThirdTest() {
    Integer result = 8;
    assertThat(fibonacci.fibonacciNumber(6), is(result));
  }


}
