package com.hillel.tasks.train;

import java.util.ArrayList;

public class Train {
  ArrayList<Coach> coaches;

  public Train(int coachesNumber) {
    coaches = new ArrayList<Coach>();
    if (coachesNumber <= 0) {
      throw new NonPositiveCoachesNumber("The number of coaches in the train should be a positive number");
    }
    for (int i = 0; i < coachesNumber; i++) {
      coaches.add(new Coach());
    }
  }

  public boolean isTrainFull() {
    for (int i = 0; i < coaches.size(); i++) {
      if (!coaches.get(i).isFull()) {
        return false;
      }
    }
    return true;
  }

  public void bookPlace(int coachNumber, int placeNumber) {
    if (checkIfValidArguments(coachNumber, placeNumber)) {
      if (!isTrainFull()) {
        coaches.get(coachNumber - 1).makeBooking(placeNumber);
      } else {
        throw new TrainIsFullException("All tickets were sold");
      }
    } else {
      throw new IllegalArgumentException();
    }
  }

  private boolean checkIfValidArguments(int coachNumber, int placeNumber) {
    return coachNumber <= coaches.size() && coachNumber > 0
        && placeNumber <= coaches.get(coachNumber - 1).getCapacity() && placeNumber > 0;
  }

  public void unbookPlace(int coachNumber, int placeNumber) {
    if (checkIfValidArguments(coachNumber, placeNumber)) {
      coaches.get(coachNumber - 1).makeUnbooking(placeNumber);
    } else {
      throw new IllegalArgumentException();
    }
  }

  public int getLength() {
    return coaches.size();
  }

  public int getCoachCapacity(int coach) {
    if (coach > coaches.size() || coach <= 0) {
      throw new IllegalArgumentException();
    }
    return coaches.get(coach - 1).getCapacity();
  }

  public boolean placeIsEmpty(int coach, int place) {
    if (checkIfValidArguments(coach, place)) {
      return coaches.get(coach - 1).getState(place) == PlaceState.Empty;
    } else {
      throw new IllegalArgumentException();
    }
  }
}
