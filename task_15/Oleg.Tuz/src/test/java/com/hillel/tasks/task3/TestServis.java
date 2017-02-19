package com.hillel.tasks.task3;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by TUZ on 08.02.2017.
 */
public class TestServis {
  public static final double score = 100;
  Servis terrible, poor, good, great, excellent;

  @Before
  public void setUp() {
    terrible = new Terrible();
    poor = new Poor();
    good = new Good();
    great = new Great();
    excellent = new Excellent();
  }

  @Test
  public void testTerrible() {
    assertThat(terrible.tips(100), is(0.0));
  }

  @Test
  public void testPoor() {
    assertThat(poor.tips(score), is(5.0));
  }

  @Test
  public void testGood() {
    assertThat(good.tips(score), is(10.0));
  }

  @Test
  public void testGreat() {
    assertThat(great.tips(score), is(15.0));
  }

  @Test
  public void testExcellent() {
    assertThat(excellent.tips(score), is(20.0));
  }


}
