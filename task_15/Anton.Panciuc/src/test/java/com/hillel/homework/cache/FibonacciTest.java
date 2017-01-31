package com.hillel.homework.cache;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciTest {
  Fibonacci fibonacci;
  static int element = 8;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }


  @Test
  public void recursiveTest() {
    assertThat(fibonacci.recursive(element), is(21));
    assertThat(fibonacci.getCacheElement(element), is(21));
    assertThat(fibonacci.getCache(element), is("1 1 2 3 5 8 13 21 "));
  }


}
