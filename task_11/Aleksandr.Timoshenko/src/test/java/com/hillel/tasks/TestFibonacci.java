package com.hillel.tasks;

import com.hillel.tasks.Fibonacci;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class TestFibonacci {


  Fibonacci fibonacci;
  int element = 11;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void testIterative() {
    assertThat(fibonacci.iterative(element), is(89));
  }


  @Test
  public void testRecursive() {
    assertThat(fibonacci.recursive(element), is(89));
  }


}
