package com.hillel.fleshlight;


public class Flashlight {

  public static final int MAX_BATTERY = 3;

  private int battery = 0;
  private String light;
  private boolean shine;


  public String lightType() {
    switch (battery) {
      case 0:
        light = "The flashlight does not shine";
        break;
      case 1:
        light = "The flashlight shines white light";
        break;
      case 2:
        light = "The flashlight shines red light";
        break;
      case 3:
        light = "The flashlight blinking";
        break;
    }
    return light;
  }

  public void insertBattery() {
    if (battery == MAX_BATTERY) {
      System.out.println("Inserting the batteries have a maximum");
    } else {
      battery++;
      shine = true;
    }
  }

  public int getBattery() {
    return battery;
  }

  public boolean isShine() {
    return shine;
  }
}