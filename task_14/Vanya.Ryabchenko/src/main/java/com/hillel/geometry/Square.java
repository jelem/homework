package com.hillel.geometry;


public class Square extends Figure {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double square() {
    return side * side;
  }

  @Override
  public double perimeter() {
    return 4 * side;
  }

}
