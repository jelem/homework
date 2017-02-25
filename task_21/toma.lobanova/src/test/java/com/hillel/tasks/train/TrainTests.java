package com.hillel.tasks.train;

import org.junit.Test;

public class TrainTests {
  private Train train;

  @Test(expected = NonPositiveCoachesNumber.class)
  public void constructorExceptionTest() {
    train = new Train(-2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void bookPlaceInvalidPlaceExceptionTest() {
    train = new Train(2);
    train.bookPlace(2, 37);
  }

  @Test(expected = IllegalArgumentException.class)
  public void bookPlaceInvalidCoachExceptionTest() {
    train = new Train(2);
    train.bookPlace(3, 3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void unbookPlaceInvalidPlaceExceptionTest() {
    train = new Train(3);
    train.bookPlace(2, 37);
  }

  @Test(expected = IllegalArgumentException.class)
  public void unbookPlaceInvalidCoachExceptionTest() {
    train = new Train(3);
    train.bookPlace(4, 3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void getCoachCapacityTest() {
    train = new Train(1);
    train.getCoachCapacity(2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void placeIsEmptyExceptionTest() {
    train = new Train(1);
    train.placeIsEmpty(5, 5);
  }
}


