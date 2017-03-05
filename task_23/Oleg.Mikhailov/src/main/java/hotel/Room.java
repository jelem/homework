package hotel;

public class Room {

  private int floor;
  private int roomNumber;

  public Room(int floor, int roomNumber) {
    this.floor = floor;
    this.roomNumber = roomNumber;
  }

  @Override
  public String toString() {
    return floor + " floor/room " + roomNumber;
  }
}
