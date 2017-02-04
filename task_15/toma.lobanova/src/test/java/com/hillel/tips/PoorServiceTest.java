package com.hillel.tips;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PoorServiceTest {
  @Test
  public void countTipsTest() {
    assertThat(new PoorService().countTips(234), is(12L));
  }
}
