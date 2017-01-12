package com.hillel.hairdryer1;


public class Hairdryer {

  public static final int MAX_SPEED = 4;
  private String power;//
  private String status;
  private int speed;

  public void setPower(String power) {
    this.power = power;
  }

  public String getStatus() {
    return power;
  }

  public void speedUp() {
    if (speed == 4) {
      System.out.println("Maximum capacity reached");
    } else {
      ++speed;
    }

  }

  public int getSpeed() {
    return speed;
  }

  public void speedDown() {
    if (speed == 1) {
      System.out.println("Minimum capacity reached");
    } else {
      --speed;
    }
  }
}
