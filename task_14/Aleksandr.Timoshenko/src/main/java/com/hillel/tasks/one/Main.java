package com.hillel.tasks.one;

public class Main {

  public static void main(String[] args) {
    Shape[] shape = new Shape[3];
    shape[0] = new Rectangle(5, 3);
    shape[1] = new Circle(7);
    shape[2] = new Square(5);

    for (Shape i : shape) {
      System.out
          .println(
              i.toString() + " Perimeter = " + i.perimeter() + "; Square = " + i.square() + ";");
    }
  }

}
