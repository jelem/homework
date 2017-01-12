package com.hillel.fleshlight;

public class Car {
  public static final int MAX_WHEEL = 4;
  public static final int MAX_FUEL = 30;
  private int fuel = 0;
  private int wheel = 0;
  private boolean canGo;

  public void carCanGo(){
    if (wheel == MAX_WHEEL){
      if (fuel == 30){
        this.canGo = true;
      }else{
        System.out.println("Insufficient fuel");
      }
    }else{
      System.out.println("Set on car four wheels");
    }
  }
  public void fuelCoupons(){
    if (fuel < MAX_FUEL){
      fuel += 10;
    }else{
      System.out.println("The tank is full");
    }
  }
  public void setWheel(){
    if (wheel < MAX_WHEEL){
      wheel += 1;
    }else{
      System.out.println("Four-wheel already installed");
    }
  }
  public int getFuel(){
    return fuel;
  }
  public int getWheel(){
    return wheel;
  }
  public boolean getCarGo(){
    return canGo;
  }
}
