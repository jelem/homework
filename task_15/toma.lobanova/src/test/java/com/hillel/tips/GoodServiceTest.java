package com.hillel.tips;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GoodServiceTest {
  @Test
  public void countTipsTest() {
    assertThat(new GoodService().countTips(234), is(23L));
  }
}