package com.hillel.tasks.ticketoffice;

import com.hillel.tasks.train.Train;

public class TicketOffice {

  private static boolean checkIfValidBooking(Train train, int coachNumber, int placeNumber) {
    return checkIfValidArguments(train, coachNumber, placeNumber)
        && !train.isTrainFull() && train.placeIsEmpty(coachNumber, placeNumber);
  }

  private static boolean checkIfValidArguments(Train train, int coachNumber, int placeNumber) {
    return coachNumber <= train.getLength() && coachNumber > 0
        && placeNumber <= train.getCoachCapacity(coachNumber) && placeNumber > 0;
  }

  public static void sellTicket(Train train, int coach, int place)
      throws BookingIsImpossibleException {
    if (checkIfValidBooking(train, coach, place)) {
      train.bookPlace(coach, place);
      System.out.println("The ticket: place " + place + " coach " + coach + " was sold");
    } else {
      throw new BookingIsImpossibleException("You need to check the parameters you enter");
    }
  }
}
