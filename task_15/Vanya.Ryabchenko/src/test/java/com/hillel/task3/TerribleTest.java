package com.hillel.task3;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


import org.junit.Before;
import org.junit.Test;

public class TerribleTest {

  ServiceLevel terrible;
  ServiceLevel poor;
  ServiceLevel good;
  ServiceLevel great;
  ServiceLevel excellent;

  @Before
  public void setUp() {
    terrible = new Terrible();
    poor = new Poor();
    good = new Good();
    great = new Great();
    excellent = new Excellent();
  }

  @Test
  public void terribleTest() {
    assertThat(terrible.tips(100), is(0.0));
  }

  @Test
  public void poorTest() {
    assertThat(poor.tips(100), is(5.0));
  }

  @Test
  public void goodTest() {
    assertThat(good.tips(100), is(10.0));
  }

  @Test
  public void greatTest() {
    assertThat(great.tips(100), is(15.0));
  }

  @Test
  public void excellentTest() {
    assertThat(excellent.tips(100), is(20.0));
  }

}
