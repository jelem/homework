package com.hillel.homework.train;


import org.junit.Before;
import org.junit.Test;

public class CarriageTest {
  Carriage carriage;

  @Before
  public void setUp() {
    carriage = new Carriage();
  }


  @Test(expected = SitAlreadySoldException.class)
  public void sellTest() throws SitAlreadySoldException {
    carriage.sell(2);
    carriage.sell(2);
  }

}
