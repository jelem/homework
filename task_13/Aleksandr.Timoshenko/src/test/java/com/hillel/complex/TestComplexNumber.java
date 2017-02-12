package com.hillel.complex;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestComplexNumber {

  ComplexNumber firstComplexNumber;

  @Before
  public void setUp() {
    firstComplexNumber = new ComplexNumber();

  }

  @Test
  public void testAddition() {
    firstComplexNumber.setComplexNumber(-1, -3);
    ComplexNumber complexResult = firstComplexNumber.addition(new ComplexNumber(3, 2));
    assertThat(complexResult.equals(new ComplexNumber(2, -1)), is (true));
  }

  @Test
  public void testSubtraction() {
    firstComplexNumber.setComplexNumber(17, 35);
    ComplexNumber complexResult = firstComplexNumber.subtraction(new ComplexNumber(15, 5));
    assertThat(complexResult.equals(new ComplexNumber(2, 40)), is(true));
  }

  @Test
  public void testDivision() {
    firstComplexNumber.setComplexNumber(-1, 2);
    ComplexNumber complexResult = firstComplexNumber.division(new ComplexNumber(2, 1));
    assertThat(complexResult.equals(new ComplexNumber(0, -1)), is (true));
  }

  @Test
  public void testMultiplications() {
    firstComplexNumber.setComplexNumber(1, 5);
    ComplexNumber complexResult = firstComplexNumber.multiplications((new ComplexNumber(5, 2)));
    assertThat(complexResult.equals(new ComplexNumber(15, 23)), is (true));
  }

  @Test
  public void testSquare() {
    firstComplexNumber.setComplexNumber(5, 5);
    ComplexNumber complexResult = firstComplexNumber.multiplications((firstComplexNumber));
    assertThat(complexResult.equals(new ComplexNumber(1, 3)), is (true));
  }


}
