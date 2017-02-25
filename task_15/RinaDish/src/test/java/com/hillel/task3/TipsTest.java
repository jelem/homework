package com.hillel.task3;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TipsTest {

  LevelOfService terrible;
  LevelOfService poor;
  LevelOfService good;
  LevelOfService great;
  LevelOfService exellent;

  @Before
  public void setUp() {
    terrible = new Terrible();
    poor = new Poor();
    good = new Good();
    great = new Great();
    exellent = new Exellent();
  }

  @Test
  public void terribleTipsTest() {
    double money = 100;
    assertThat(terrible.tips(money), is(100.0));
  }


  @Test
  public void poorTipsTest() {
    double money = 100;
    assertThat(poor.tips(money), is(105.0));
  }


  @Test
  public void goodTipsTest() {
    double money = 100;
    assertThat(good.tips(money), is(110.0));
  }


  @Test
  public void greatTipsTest() {
    double money = 100;
    assertThat(great.tips(money), is(115.0));
  }

  @Test
  public void exellentTipsTest() {
    double money = 100;
    assertThat(exellent.tips(money), is(120.0));
  }
}
