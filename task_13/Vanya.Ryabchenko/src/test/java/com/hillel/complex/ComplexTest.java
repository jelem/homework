package com.hillel.complex;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ComplexTest {

  Complex firstNumber;
  Complex secondNumber;

  @Before
  public void setUp() {
    firstNumber = new Complex(2, 5);
    secondNumber = new Complex(3, 5);
  }

  @Test
  public void addTest() {
    Complex addResult = firstNumber.add(secondNumber);
    assertThat(addResult.equals(new Complex(5, 10)), is(true));
  }

  @Test
  public void subtractionTest() {
    Complex subtractionResult = firstNumber.subtraction(secondNumber);
    assertThat(subtractionResult.equals(new Complex(-1, 0)), is(true));
  }

  @Test
  public void multiplicationTest() {
    Complex multiplicationResult = firstNumber.multiplication(secondNumber);
    assertThat(multiplicationResult.equals(new Complex(-19, 25)), is(true));
  }

  @Test
  public void divisionTest() {
    Complex divisionResult = firstNumber.division(secondNumber);
    assertThat(divisionResult.equals(new Complex(0.9117647058823529, 0.14705882352941177)),
        is(true));
  }

  @Test
  public void sqrtTest() {
    Complex sqrtResult = firstNumber.sqrt();
    assertThat(sqrtResult.equals(new Complex(1.921609326467597, 1.3009928530039094)), is(true));
  }

}
