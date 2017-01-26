package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

  private Fibonacci fibonacci;

  @Before
  public void setUp() {
    this.fibonacci = new Fibonacci();
  }

  @Test
  public void testIterative() {
    int result = this.fibonacci.iterative(10);
    assertThat(55, is(result));
  }

  @Test
  public void testRecursive() {
    int result = this.fibonacci.recursive(10);
    assertThat(55, is(result));
  }
}
