package com.hillel.tasks.third;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestServiceLevel {

  private double bill = 100;
  ServiceLevel terrible, poor, good, great, excellent;

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
    assertThat(terrible.tipsAmount(bill), is(0.0));
  }

  @Test
  public void testPoor() {
    assertThat(poor.tipsAmount(bill), is(5.0));
  }

  @Test
  public void testGood() {
    assertThat(good.tipsAmount(bill), is(10.0));
  }

  @Test
  public void testGreat() {
    assertThat(great.tipsAmount(bill), is(15.0));
  }

  @Test
  public void testExcellent() {
    assertThat(excellent.tipsAmount(bill), is(20.0));
  }

}
