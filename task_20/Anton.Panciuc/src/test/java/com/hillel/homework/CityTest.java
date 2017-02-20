package com.hillel.homework;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class CityTest {
  City cityFirst;
  City citySecond;

  @Test
  public void createObjectTest() {
    cityFirst = new City.Builder()
        .setCityName("NewYork")
        .setCountry("USA")
        .build();
    assertThat(cityFirst.toString(), is(equalTo("NewYork, USA")));
  }

  @Test
  public void equalsCompareToTestPositive() {
    cityFirst = new City.Builder()
        .setCityName("NewYork")
        .setCountry("USA")
        .build();
    citySecond = new City.Builder()
        .setCityName("NewYork")
        .setCountry("USA")
        .build();
    assertThat(cityFirst.equals(citySecond), is(true));
    assertThat(cityFirst.compareTo(citySecond), is(0));
  }

  @Test
  public void equalsCompareToTestNegative() {
    cityFirst = new City.Builder()
        .setCityName("Chicago")
        .setCountry("USA")
        .build();
    citySecond = new City.Builder()
        .build();
    assertThat(cityFirst.equals(citySecond), is(false));
    assertTrue(cityFirst.compareTo(citySecond) < 0);
  }
}
