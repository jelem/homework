package com.hillel.task1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestComplex {
  Complex number1;
  Complex number2;

  @Before
  public void setUp() {
    number1 = new Complex(2, 3);
    number2 = new Complex(1, 4);

  }

  @Test
  public void additionTest() {

    Complex Result = number1.addition(number2);
    assertThat(Result.getReal(), is(3.0));
    assertThat(Result.getImaginary(), is(7.0));
  }

  @Test
  public void subtractionTest() {

    Complex Result = number1.subtraction(number2);
    assertThat(Result.getReal(), is(1.0));
    assertThat(Result.getImaginary(), is(-1.0));
  }

  @Test
  public void multiplicationTest() {

    Complex Result = number1.multiplication(number2);
    assertThat(Result.getReal(), is(-10.0));
    assertThat(Result.getImaginary(), is(11.0));
  }

  @Test
  public void divisionTest() {

    Complex Result = number1.division(number2);
    assertThat(Result.getReal(), is(0.8235294117647058));
    assertThat(Result.getImaginary(), is(-0.29411764705882354));
  }

  @Test
  public void sqrtTest() {

    Complex Result = number1.sqrt(number2);
    assertThat(Result.getReal(), is(1.6741492280355401));
    assertThat(Result.getImaginary(), is(0.895977476129838));
  }


}
