package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestFibonacci {

  Fibonacci fibonacci;
  static int element = 10;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }


  @Test
  public void testNonRecursive() {
    assertThat(fibonacci.iterative(element), is(55));
  }

  @Test
  public void recursive() {
    assertThat(fibonacci.recursive(element), is(55));
  }
}