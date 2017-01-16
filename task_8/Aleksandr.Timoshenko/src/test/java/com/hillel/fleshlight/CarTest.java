package com.hillel.fleshlight;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarTest {

  Car car;

  @Before
  public void setUp() {
    car = new Car();
  }

  @Test
  public void testCarCanGo() {
    assertThat(car.getCarGo(), is(false));
  }

  @Test
  public void testHasWheel() {
    assertThat(car.getWheel(), is(0));

    car.setWheel();

    assertThat(car.getWheel(), is(1));

    car.setWheel();

    assertThat(car.getWheel(), is(2));

    car.setWheel();

    assertThat(car.getWheel(), is(3));

    car.setWheel();

    assertThat(car.getWheel(), is(4));

    car.setWheel();

    assertThat(car.getWheel(), is(4));
  }

  @Test
  public void testFuel() {
    assertThat(car.getFuel(), is(0));

    car.fuelCoupons();

    assertThat(car.getFuel(), is(10));

    car.fuelCoupons();

    assertThat(car.getFuel(), is(20));

    car.fuelCoupons();

    assertThat(car.getFuel(), is(30));

    car.fuelCoupons();

    assertThat(car.getFuel(), is(30));
  }

  @After
  public void test2CarCanGo() {
    car.setWheel();
    car.setWheel();
    car.setWheel();
    car.setWheel();
    car.fuelCoupons();
    car.fuelCoupons();
    car.fuelCoupons();
    car.carCanGo();
    assertThat(car.getCarGo(), is(true));
  }

}