package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.tasks.second.BigFibonacci;
import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;

public class TestSecondTask {

  BigFibonacci bigFibonacci;

  @Before
  public void setUp() {
    bigFibonacci = new BigFibonacci();
  }

  @Test
  public void testBifSearch() {
    BigInteger num = BigInteger.valueOf(6);
    BigInteger expectedResult = BigInteger.valueOf(8);
    assertThat(bigFibonacci.searchNumFibonacci(num), is(expectedResult));
  }

}
