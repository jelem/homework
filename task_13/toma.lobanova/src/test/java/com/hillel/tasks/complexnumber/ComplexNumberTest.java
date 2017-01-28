package com.hillel.tasks.complexnumber;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.lang.Math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ComplexNumberTest {
  private ComplexNumber complexNumber;
  private Random random = new Random();
  private static final double max = 55D;
  private double real;
  private double imaginary;

  @Before
  public void setUp() {
    real = random.nextDouble() * max;
    imaginary = random.nextDouble() * max;
    complexNumber = new ComplexNumber(real, imaginary);
  }

  @Test
  public void costructorText() {
    double actualX = complexNumber.getReal();
    double actualY = complexNumber.getImaginary();
    assertThat(actualX, is(real));
    assertThat(actualY, is(imaginary));
  }

  @Test
  public void toStringTest() {
    real = Math.round(real * 100) / 100D;
    imaginary = Math.round(imaginary * 100) / 100D;
    String newString = "(" + real + ", " + imaginary + ")";
    String actualString = complexNumber.toString();
    assertThat(actualString, is(equalTo(newString)));
  }
}
