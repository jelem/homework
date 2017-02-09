package com.hillel.geometry;

public class Geometry {

  public static void main(String[] args) {
    Figure[] figure = new Figure[3];
    Figure rectangle = new Rectangle(5, 8);
    Figure square = new Square(9);
    Figure circle = new Circle(4);

    figure[0] = rectangle;
    figure[1] = square;
    figure[2] = circle;

    for (int i = 0; i < 3; i++) {
      System.out.println(figure[i].square());
      System.out.println(figure[i].perimeter());
    }
  }

}
