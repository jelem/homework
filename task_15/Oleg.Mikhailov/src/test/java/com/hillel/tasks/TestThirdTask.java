package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.tasks.third.Good;
import com.hillel.tasks.third.Great;
import com.hillel.tasks.third.Normal;
import com.hillel.tasks.third.Terrible;
import com.hillel.tasks.third.Service;
import org.junit.Before;
import org.junit.Test;

public class TestThirdTask {

  public static final double COST = 250.0;

  Service great, good, normal, terrible;

  @Before
  public void setUp() {
    great = new Great();
    good = new Good();
    normal = new Normal();
    terrible = new Terrible();
  }

  @Test
  public void testGrearServise() {
    assertThat(great.tips(COST), is(37.5));
  }

  @Test
  public void testGoodService() {
    assertThat(good.tips(COST), is(25.0));
  }

  @Test
  public void testNormalService() {
    assertThat(normal.tips(COST), is(12.5));
  }

  @Test
  public void testTerribleService() {
    assertThat(terrible.tips(COST), is(0.0));
  }

}
