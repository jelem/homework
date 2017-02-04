package com.hillel.tips;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExcellentServiceTest {
  @Test
  public void countTipsTest() {
    assertThat(new ExcellentService().countTips(234), is(47L));
  }
}
