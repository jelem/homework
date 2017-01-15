package com.hillel.hairdryer1;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HairdryerTest {

  @Test
  public void HairdryerTest() {
    Hairdryer hairdryer = new Hairdryer();
    hairdryer.setPower("on");
    assertThat(hairdryer.getStatus(), is("on"));

    for (int i = 0; i < Hairdryer.MAX_SPEED; i++) {
      hairdryer.speedUp();
      System.out.println(hairdryer.getSpeed());
    }


    for (int i = Hairdryer.MAX_SPEED; i > 1; i--) {
      hairdryer.speedDown();
      System.out.println(hairdryer.getSpeed());
    }

    hairdryer.setPower("off");
    assertThat(hairdryer.getStatus(), is("off"));

  }
}
