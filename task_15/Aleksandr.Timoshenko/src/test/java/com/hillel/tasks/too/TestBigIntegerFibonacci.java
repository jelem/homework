package com.hillel.tasks.too;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;

public class TestBigIntegerFibonacci {

  BigIntFibonacci bigIntegerFibonnacci;

  @Before
  public void setUp() {
    bigIntegerFibonnacci = new BigIntFibonacci();
  }

  @Test
  public void testBigIntAt() {
    BigInteger position = BigInteger.valueOf(5);
    BigInteger result = BigInteger.valueOf(5);
    assertThat(bigIntegerFibonnacci.getBigIntegerElementAt(position), is(result));
  }
}
