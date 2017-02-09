package com.hillel.tasks.first;

public class Main {
  public static void main(String[] args) {
    Figure square = new Square(4);
    Figure rectangle = new Rectangle(5, 5);
    Figure circle = new Circle(5);

    System.out.println(square.area() + " " + square.perimeter());
    System.out.println(rectangle.area() + " " + rectangle.perimeter());
    System.out.println(circle.area() + " " + circle.perimeter());

  }
}
