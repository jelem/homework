package com.hillel.tasks.first;

public class Main {
  public static void main(String[] args) {
    Figure Square = new Square(4);
    Figure Rectangle = new Rectangle(5, 5);
    Figure Circle = new Circle(5);

    System.out.println(Square.area() + " " + Square.perimeter());
    System.out.println(Rectangle.area() + " " + Rectangle.perimeter());
    System.out.println(Circle.area() + " " + Circle.perimeter());

  }
}
