package com.hillel.flashlight;

public class Flashlight {

  public static final int MAXIMUX_BATTERIES = 3;
  private String name;
  private int batteries;
  private boolean shines;
  private String color;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getBatteries() {
    return batteries;
  }

  public boolean isShines() {
    return shines;
  }

  public void insertBatteries() {
    if (batteries == 3) {
      System.out.println("Maximum capacity reached");
    } else {
      ++batteries;
      if (batteries > 0) {
        shines = true;
      }

    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(int color) {
    switch (color) {
      case 1:
        if (batteries > 0) {
          this.color = "wite";
        } else {
          System.out.println("Not enough batteries");
        }
        break;
      case 2:
        if (batteries > 1) {
          this.color = "red";
        } else {
          System.out.println("Not enough batteries");
        }
        break;
      case 3:
        if (batteries > 2) {
          this.color = "blink";
        } else {
          System.out.println("Not enough batteries");
        }
        break;
      default:
        if (batteries > 0) {
          this.color = "wite";
        } else {
          System.out.println("Not enough batteries");
        }
        break;
    }

  }
}
