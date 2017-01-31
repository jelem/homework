package com.hillel.tasks.complexnumber;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MathTest {
  private MyMath myMath;
  private ComplexNumber number1;
  private ComplexNumber number2;
  private static final double X1 = 2.3456;
  private static final double X2 = 2.7;
  private static final double Y1 = 234.5;
  private static final double Y2 = 534.567;

  @Before
  public void setUp() {
    myMath = new MyMath();
    number1 = new ComplexNumber(X1, Y1);
    number2 = new ComplexNumber(X2, Y2);
  }

  @Test
  public void additionTest() {
    templateFunction(MyMath::addition, new ComplexNumber(5.05, 769.07));
  }

  @Test
  public void multiplicationTest() {
    templateFunction(MyMath::multiplication, new ComplexNumber(-125349.63, 1887.03));
  }

  @Test
  public void divisionTest() {
    templateFunction(MyMath::division, new ComplexNumber(0.438683766, -0.002172139));
  }

  @Test
  public void subtractionTest() {
    templateFunction(MyMath::subtraction, new ComplexNumber(-0.3544, -300.067));
  }

  @Test
  public void radixTest() {
    ComplexNumber result = new ComplexNumber(10.8825, 10.7741);
    ComplexNumber actualResult = myMath.radix(number1);
    assertThat(actualResult.toString(), is(equalTo(result.toString())));
  }

  interface Func {
    ComplexNumber transform(ComplexNumber n1, ComplexNumber n2);
  }

  public void templateFunction(Func func, ComplexNumber result) {
    ComplexNumber actualResult = func.transform(number1, number2);
    assertThat(actualResult.toString(), is(equalTo(result.toString())));
  }
}

