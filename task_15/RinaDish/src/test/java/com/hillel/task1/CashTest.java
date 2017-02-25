package com.hillel.task1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CashTest {

  Cash cash;

  @Before
  public void setUp() {
    cash = new Cash();
  }

  @Test
  public void calculationTest() {
    int number = 10;
    assertThat(cash.calculation(number), is(55));
  }


}
