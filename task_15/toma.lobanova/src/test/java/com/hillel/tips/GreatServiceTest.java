package com.hillel.tips;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreatServiceTest {
  @Test
  public void countTipsTest() {
    assertThat(new GreatService().countTips(234), is(35L));
  }
}
