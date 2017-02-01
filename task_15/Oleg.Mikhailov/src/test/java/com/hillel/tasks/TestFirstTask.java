package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.tasks.first.FibonacciNam;
import org.junit.Before;
import org.junit.Test;

public class TestFirstTask {

  FibonacciNam fibonacciNam;

  @Before
  public void setUp() {
    fibonacciNam = new FibonacciNam();
  }

  @Test
  public void testUpperReturn() {
    int num = 12;
    assertThat(fibonacciNam.searchNumFibonacci(num), is(144));

    int num2 = 10;
    assertThat(fibonacciNam.searchNumFibonacci(num2), is(55));
  }

  @Test
  public void testLowReturn() {
    int num1 = 1;
    assertThat(fibonacciNam.searchNumFibonacci(num1), is(1));
    int num2 = 2;
    assertThat(fibonacciNam.searchNumFibonacci(num2), is(1));
    int num3 = 3;
    assertThat(fibonacciNam.searchNumFibonacci(num3), is(2));
    int num4 = 4;
    assertThat(fibonacciNam.searchNumFibonacci(num4), is(3));

  }


}
