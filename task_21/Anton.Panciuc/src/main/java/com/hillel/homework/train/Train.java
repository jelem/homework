package com.hillel.homework.train;


import java.util.ArrayList;

public class Train {
  private ArrayList<Carriage> carriages;


  public Train(int carriageNumber) throws InvalidInputException {
    carriages = new ArrayList<Carriage>();
    if (carriageNumber <= 0) {
      throw new InvalidInputException("You should enter positive number above  0");
    }
    for (int i = 0; i < carriageNumber; i++) {
      carriages.add(new Carriage());
    }
  }

  public boolean trainIsFull() {
    for (int i = 0; i < carriages.size(); i++) {
      if (!carriages.get(i).isFull()) {
        return false;
      }
    }
    return true;
  }

  public void sellSit(int carriageNumber, int sitNumber) {
    if (checkInput(carriageNumber, sitNumber)) {
      if (!trainIsFull()) {
        try {
          carriages.get(carriageNumber - 1).sell(sitNumber);
        } catch (SitAlreadySoldException exception) {
          System.out.println(exception);
        }
      } else {
        throw new AllTicketsSoldException("All tickets are sold");
      }
    }
  }

  private boolean checkInput(int carriageNimber, int sitNumber) {
    return carriageNimber <= carriages.size() && carriageNimber > 0
        && sitNumber <= carriages.get(carriageNimber - 1).getMaxPassengerss() && sitNumber > 0;
  }

  public void refundSit(int carriageNimber, int sitNumber) {
    if (checkInput(carriageNimber, sitNumber)) {
      carriages.get(carriageNimber - 1).refund(sitNumber);
    } else {
      throw new InvalidInputException("This ticket does not exist");
    }
  }

  public void printTrainStatus() {
    for (int i = 0; i < carriages.size(); i++) {
      System.out.println();
      System.out.println("Carriage " + (i + 1));
      for (int j = 1; j < carriages.get(i).getMaxPassengerss() + 1; j++) {
        switch (carriages.get(i).getSitStatus(j)) {
          case AVAILABLE:
            System.out.print("Sit " + (j) + " is Available | ");
            break;
          case SOLD:
            System.out.print("Sit " + (j) + " is Sold | ");
            break;
          default:
            break;
        }
        if (j % 4 == 0) {
          System.out.println();
        }
      }
      System.out.println();
    }
  }
}
