package com.hillel.homework.figures;


import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Figure[] array = new Figure[3];
    array[0] = new Rectangle(5.0, 8.2);
    array[1] = new Triangle(4.76, 5, 7.12);
    array[2] = new Circle(5.2);

    for (int i = 0; i < array.length; i++) {
      System.out.println("Figure #" + (i + 1) + array[i].area() + " " + array[i].perimeter());
    }
  }
}
