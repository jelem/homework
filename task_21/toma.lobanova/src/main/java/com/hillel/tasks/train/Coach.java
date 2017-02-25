package com.hillel.tasks.train;

public class Coach {
  private PlaceState[] places;
  private static final int CAPACITY = 36;

  public Coach() {
    places = new PlaceState[CAPACITY];
    for (int i = 0; i < CAPACITY; i++) {
      places[i] = PlaceState.Empty;
    }
  }

  public boolean isFull() {
    for (int i = 0; i < CAPACITY; i++) {
      if (places[i] == PlaceState.Empty) {
        return false;
      }
    }
    return true;
  }

  public PlaceState getState(int placeNumber) {
    return places[placeNumber - 1];
  }

  public void makeBooking(int placeNumber) {
    if (places[placeNumber - 1] == PlaceState.Busy) {
      throw new PlaceIsBusyException("This place was already booked");
    }
    places[placeNumber - 1] = PlaceState.Busy;
  }

  public void makeUnbooking(int placeNumber) {
    places[placeNumber - 1] = PlaceState.Empty;
  }

  public int getCapacity() {
    return CAPACITY;
  }
}
