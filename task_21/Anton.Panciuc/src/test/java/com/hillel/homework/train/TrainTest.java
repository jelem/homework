package com.hillel.homework.train;


import org.junit.Before;
import org.junit.Test;

public class TrainTest {
  public Train train;

  @Before
  public void setUp() {
    train = new Train(2);
  }

  @Test(expected = InvalidInputException.class)
  public void constructorTest() {
    train = new Train(0);
  }

  @Test(expected = AllTicketsSoldException.class)
  public void allTicketsSoldTest() {
    for (int i = 1; i < 3; i++) {
      for (int j = 1; j < 37; j++) {
        train.sellSit(i, j);
      }
    }

    train.sellSit(1, 5);
  }

  @Test(expected = InvalidInputException.class)
  public void refundTesst() {
    train.refundSit(6, 7);
  }
}
