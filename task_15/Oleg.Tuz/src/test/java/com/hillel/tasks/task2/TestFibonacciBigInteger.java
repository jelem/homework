package com.hillel.tasks.task2;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by TUZ on 15.02.2017.
 */
public class TestFibonacciBigInteger {
  FibonacciBigInteger fibonacciBigInteger;

  @Before
  public void setUp() {

    fibonacciBigInteger = new FibonacciBigInteger();
  }
  @Test
  public void testFibonacciBigInteger(){
    BigInteger num = BigInteger.valueOf(5);
    BigInteger extendedResult = BigInteger.valueOf(5);

    assertThat(fibonacciBigInteger.getBigIntegerElementAt(num), is(extendedResult));
  }

}
