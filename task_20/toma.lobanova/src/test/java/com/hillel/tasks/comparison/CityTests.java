package com.hillel.tasks.comparison;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CityTests {
  City cityFirst;
  City citySecond;

  @Test
  public void createObjectTest() {
    cityFirst = new City.Builder()
        .setName("Odessa")
        .setCountry("Ukraine")
        .build();
    assertThat(cityFirst.toString(), is(equalTo("Odessa, unset region, Ukraine")));
  }

  @Test
  public void equalsCompareToTestPositive() {
    cityFirst = new City.Builder()
        .setName("Odessa")
        .setCountry("Ukraine")
        .build();
    citySecond = new City.Builder()
        .setName("Odessa")
        .setCountry("Ukraine")
        .build();
    assertThat(cityFirst.equals(citySecond), is(true));
    assertThat(cityFirst.compareTo(citySecond), is(0));
  }

  @Test
  public void equalsCompareToTestNegative() {
    cityFirst = new City.Builder()
        .setName("Kiev")
        .setRegion("Kievska")
        .setCountry("Ukraine")
        .build();
    citySecond = new City.Builder()
        .build();
    assertThat(cityFirst.equals(citySecond), is(false));
    assertTrue(cityFirst.compareTo(citySecond) < 0);
  }
}
