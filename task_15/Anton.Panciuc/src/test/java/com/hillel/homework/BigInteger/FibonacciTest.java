package com.hillel.homework.BigInteger;



import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciTest {
  com.hillel.homework.cache.Fibonacci fibonacci;
  static int element = 8;

  @Before
  public void setUp() {

    fibonacci = new com.hillel.homework.cache.Fibonacci();
  }


  @Test
  public void recursiveTest() {
    assertThat(fibonacci.recursive(element), is(21));
;
  }
}
