package com.hillel.homework;

public class Room {
  private int roomNumber;

  public Room(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  @Override
  public String toString() {
    return "Room: " + roomNumber;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Room room = (Room) obj;

    return roomNumber == room.roomNumber;
  }

  @Override
  public int hashCode() {
    return roomNumber;
  }
}
