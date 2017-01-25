package com.hillel.fleshlight;

public class Human {

  private int money = 100;
  private boolean atWork = false;

  Car car = new Car();

  public void payForWheel() {
    if (car.getWheel() < car.MAX_WHEEL) {
      if (money >= 10) {
        car.setWheel();
        money -= 10;
      } else {
        System.out.println("Not enough money");
      }
    }
  }

  public void payForFuil() {
    if (car.getFuel() < car.MAX_FUEL) {
      if (money >= 20) {
        car.fuelCoupons();
        money -= 20;
      } else {
        System.out.println("Not enough money");
      }
    }
  }

  public boolean isAtWork() {
    car.carCanGo();
    if (car.getCarGo()) {
      return atWork = true;
    }
    return atWork;
  }

  public int getMoney() {
    return money;
  }
}