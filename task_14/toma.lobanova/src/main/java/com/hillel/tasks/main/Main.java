package com.hillel.tasks.main;

import com.hillel.tasks.figures.Circle;
import com.hillel.tasks.figures.Figure;
import com.hillel.tasks.figures.Rectangle;
import com.hillel.tasks.figures.Square;

import java.util.Random;

public class Main {
  static Random rnd = new Random();

  public static Figure generatorOfFigures() {
    int number = rnd.nextInt(3);
    switch (number) {
      case 0:
        return new Rectangle(6.88, 7.55);
      case 1:
        return new Square(4.76);
      case 2:
        return new Circle(3.5);
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    Figure[] array = new Figure[10];
    for (int i = 0; i < 10; i++) {
      array[i] = generatorOfFigures();
      System.out.println("The figure " + (i + 1) + " is " + array[i].showFigure());
      array[i].findSquare();
      array[i].findPerimeter();
    }
  }
}
