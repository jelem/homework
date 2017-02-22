package ticketselling;

import java.util.Arrays;

public class Wagon {

  private static final int PLACE_NUMBER = 36;
  private boolean[] place;

  private Wagon() {
    this.place = new boolean[PLACE_NUMBER];
    for (int i = 0; i < PLACE_NUMBER; i++) {
      place[i] = true;
    }
  }

  public boolean isFull() {
    for (int i = 0; i < place.length; i++) {
      if (place[i]) {
        return false;
      }
    }
    return true;
  }

  public void buyPlace(int placeNumber) {
    if (!place[placeNumber]) {
      System.out.println("This place is sold.");
    }
    place[placeNumber] = false;
  }

  public void returnPlace(int placeNumber) {
    if (place[placeNumber]) {
      System.out.println("This place is free.");
    }
    place[placeNumber] = true;
  }

  @Override
  public String toString() {
    return Arrays.toString(place);
  }
}
