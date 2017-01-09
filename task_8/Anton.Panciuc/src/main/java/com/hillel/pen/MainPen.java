package com.hillel.pen;


public class MainPen {
  public static void main(String[] args) {
    Pen pen = new Pen();
    pen.click();
    while (pen.getInk() > 0) {
      pen.write();
    }
    System.out.println("Ink left " + pen.getInk());
    pen.changeInk();
    System.out.println("Ink changed " + pen.getInk());

  }
}
