package com.hillel.homework;

import java.util.HashMap;

public class Hotel {
  HashMap<Guest, Room> hotel;
  private static final int CAPACITY = 32;

  public Hotel() {
    hotel = new HashMap<Guest, Room>(CAPACITY);
  }

  public void put(Guest guest, Room room) {
    hotel.put(guest, room);
  }

  public Room get(Guest guest) {
    return hotel.get(guest);
  }

  public int getCapacity() {
    return hotel.size();
  }

  public Class getHotelClass() {
    return hotel.getClass();
  }
}
