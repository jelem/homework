package com.hillel.tasks.one;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestFibonacci {

  Fibonacci fibonacci;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void teseFibonacci1() {
    assertThat(fibonacci.getElementAt(5), is(5));
  }

  @Test
  public void teseFibonacci2() {
    assertThat(fibonacci.getElementAt(3), is(2));
  }

  @Test
  public void teseFibonacci3() {
    assertThat(fibonacci.getElementAt(10), is(55));
  }

}
