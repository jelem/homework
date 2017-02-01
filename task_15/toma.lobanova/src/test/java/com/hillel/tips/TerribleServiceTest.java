package com.hillel.tips;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TerribleServiceTest {
  @Test
  public void countTipsTest() {
    assertThat(new TerribleService().countTips(234), is(0L));
  }
}
