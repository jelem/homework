package com.hillel.tasks.first;


public class Square implements Figure {
  private double Side;

  public Square(double Side) {
    this.Side = Side;
  }

  @Override
  public double area() {
    double area = this.Side * this.Side;
    return area;
  }

  @Override
  public double perimeter() {
    double perimeter = this.Side * 4;
    return perimeter;

  }

}
