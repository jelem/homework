package com.hillel.homework;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.core.IsEqual.equalTo;

public class HotelTest {
  Hotel hotel;
  Guest guest1;
  Guest guest2;
  Guest guest3;

  Room room;
  Room room2;
  Room room3;

  @Before
  public void setUp() {
    hotel = new Hotel();

  }

  @Test
  public void putToHotelTest() {
    guest1 = new Guest("John", "Doe");
    room = new Room(112);
    hotel.put(guest1, room);
    assertThat(hotel.getCapacity(), is(1));
    fillGuests();
    assertThat(hotel.getCapacity(), is(3));
  }

  @Test
  public void getFromHotelTest() {
    fillGuests();
    room = hotel.get(guest2);
    assertThat(room, is(equalTo(new Room(115))));
  }

  private void fillGuests() {
    guest1 = new Guest("John", "Doe");
    room = new Room(112);
    hotel.put(guest1, room);
    assertThat(hotel.getCapacity(), is(1));
    guest2 = new Guest("John", "Timber");
    room2 = new Room(115);
    hotel.put(guest2, room2);
    guest3 = new Guest("John", "Dillinger");
    room3 = new Room(215);
    hotel.put(guest3, room3);
  }
}
