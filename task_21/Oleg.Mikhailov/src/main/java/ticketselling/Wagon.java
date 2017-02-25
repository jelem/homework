package ticketselling;

import java.util.Arrays;

public class Wagon {

  private static final int PLACE_NUMBER = 36;
  private boolean[] place = new boolean[PLACE_NUMBER];


  public boolean isFull() {
    for (int i = 0; i < place.length; i++) {
      if (!place[i]) {
        return false;
      }
    }
    return true;
  }


  public void buyPlace(int placeNumber) throws NoTicketException {
    if (placeNumber > PLACE_NUMBER) {
      throw new IndexOutOfBoundsException("This is no place.");
    }

    if (place[placeNumber]) {
      throw new NoTicketException("This place is sold.");
    }

    place[placeNumber] = true;
  }

  public void returnPlace(int placeNumber) throws NoTicketException {
    if (placeNumber > PLACE_NUMBER) {
      throw new IndexOutOfBoundsException("This is no place.");
    }
    if (!place[placeNumber]) {
      throw new NoTicketException("This place is not sold.");
    }
    place[placeNumber] = false;
  }

  public boolean getPlace(int index) {
    return place[index];
  }

  @Override
  public String toString() {
    return Arrays.toString(place);
  }

  public static class Builder {

    private boolean[] place = new boolean[PLACE_NUMBER];

    public Wagon build() {
      return new Wagon(this);
    }
  }

  private Wagon(Builder builder) {
    this.place = builder.place;
  }
}
