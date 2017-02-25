package com.hillel.task2;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;

public class FibonachiBigIntegerTest {

  FibonachiBigInteger fibonachiBigInteger;

  @Before
  public void setUp() {
    fibonachiBigInteger = new FibonachiBigInteger();
  }

  @Test
  public void calculationTest() {
    BigInteger result = BigInteger.valueOf(6765);
    int number = 20;
    assertThat(fibonachiBigInteger.calculation(number), is(result));
  }


}
