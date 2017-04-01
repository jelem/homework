package com.hillel.tasks.task1;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestFibonacciNCache {
  FibonacciNCache fibonacciNCache;

  @Before
  public void setUp() {
    fibonacciNCache = new FibonacciNCache();
  }
  @Test
  public void testFibonacciNCache(){
    assertThat(fibonacciNCache.getElementAt(10), is(55));
  }

}
