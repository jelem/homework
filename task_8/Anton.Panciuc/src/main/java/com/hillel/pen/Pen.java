package com.hillel.pen;


public class Pen {
  private boolean status;
  private int ink = 100;

  public void click() {
    status = !status;
  }

  public void write() {
    if (status && ink > 0) {
      ink -= 5;
    } else {
      System.out.println("pen is off");
    }
  }

  public int getInk() {
    return ink;
  }

  public void changeInk() {
    ink = 100;
  }
}
