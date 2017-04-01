package com.hillel.tasks.first;


public class Square implements Figure {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    double area = this.side * this.side;
    return area;
  }

  @Override
  public double perimeter() {
    double perimeter = this.side * 4;
    return perimeter;

  }

}
