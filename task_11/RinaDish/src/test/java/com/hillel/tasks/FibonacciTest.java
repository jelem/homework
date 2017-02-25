package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

  Fibonacci task1;

  @Before
  public void setUp() {
    task1 = new Fibonacci();
  }

  @Test
  public void iterativeTest() {
    int element = 5;
    assertThat(task1.iterative(element), is(5));
  }

  @Test
  public void recursiveTest() {
    int element = 8;
    assertThat(task1.recursive(element), is(21));
  }


}
