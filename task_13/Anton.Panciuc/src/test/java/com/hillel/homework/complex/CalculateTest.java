package com.hillel.homework.complex;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {
  private Calculate calculate;
  private Complex number1;
  private Complex number2;

  @Before
  public void setUp() {
    calculate = new Calculate();
    number1 = new Complex(3, 5);
    number2 = new Complex(4, 7);
  }

  @Test
  public void addTest() {
    Complex result = calculate.add(number1, number2);
    assertThat(result.toString(), is((new Complex(7.0, 12.0)).toString()));
  }

  @Test
  public void subtTest() {
    Complex result = calculate.subt(number1, number2);
    assertThat(result.toString(), is((new Complex(-1.0, -2.0)).toString()));
  }

  @Test
  public void multTest(){
    Complex result = calculate.mult(number1, number2);
    assertThat(result.toString(), is((new Complex(-23.0, 41.0)).toString()));
  }

  @Test
  public void divTest(){
    Complex result = calculate.div(number1, number2);
    assertThat(result.toString(), is((new Complex(0.7230769230769231, -0.015384615384615385)).toString()));
  }
}
