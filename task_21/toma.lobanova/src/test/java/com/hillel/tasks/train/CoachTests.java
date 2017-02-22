package com.hillel.tasks.train;

import org.junit.Before;
import org.junit.Test;

public class CoachTests {
  Coach coach;

  @Before
  public void setUp() {
    coach = new Coach();
  }

  @Test(expected = PlaceIsBusyException.class)
  public void bookPlaceExceptionTest() {
    coach.makeBooking(1);
    coach.makeBooking(1);
  }
}
