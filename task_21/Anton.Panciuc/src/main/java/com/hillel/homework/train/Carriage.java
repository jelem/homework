package com.hillel.homework.train;


public class Carriage {

  private static final int MAX_PASSENGERSS = 36;
  private Sits[] sits;

  public Carriage() {
    sits = new Sits[MAX_PASSENGERSS];
    for (int i = 0; i < MAX_PASSENGERSS; i++) {
      sits[i] = Sits.AVAILABLE;
    }
  }

  public Sits getSitStatus(int sitNumber) {
    return sits[sitNumber - 1];
  }

  public void sell(int sitNumber) throws SitAlreadySoldException {
    if (sits[sitNumber - 1] == Sits.SOLD) {
      throw new SitAlreadySoldException("This sit is already sold");
    }
    sits[sitNumber - 1] = Sits.SOLD;
  }

  public void refund(int sitNumber) {
    sits[sitNumber - 1] = Sits.AVAILABLE;
  }

  public boolean isFull() {
    for (int i = 0; i < MAX_PASSENGERSS; i++) {
      if (sits[i] == Sits.AVAILABLE) {
        return false;
      }
    }
    return true;
  }

  public int getMaxPassengerss() {
    return MAX_PASSENGERSS;
  }
}
