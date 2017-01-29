package com.hillel.homework.complex;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ComplexTest {
  private Complex number;
  private double real = 3.0;
  private double imaginary = 5.0;

  @Before
  public void setUp() {
    number = new Complex(3, 5);
  }

  @Test
  public void createTest() {
    double testReal = number.getReal();
    double testImaginary = number.getImaginary();
    assertThat(testReal, is(real));
    assertThat(testImaginary, is(imaginary));

  }
}
