package com.hillel.tasks;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciTest {

  private Fibonacci fibonacci;

  @Before
  public void setUp() {
    this.fibonacci = new Fibonacci();
  }
  @Test
  public void testRecursive() {
    int result = this.fibonacci.recursive(7);
    assertThat(13, is(result));
  }
  @Test
  public void testInterative() {
    int result = this.fibonacci.recursive(7);
    assertThat(13, is(result));
  }

}
