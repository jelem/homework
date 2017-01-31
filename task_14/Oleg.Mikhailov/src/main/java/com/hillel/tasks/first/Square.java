package com.hillel.tasks.first;

public class Square implements Figure {

  private double firstSide;
  private double secondSide;

  public Square(double firstSide, double secondSide) {
    this.firstSide = firstSide;
    this.secondSide = secondSide;
  }

  @Override
  public double area() {
    double area = this.firstSide * this.secondSide;
    return area;
  }

  @Override
  public double perimeter() {
    double perimeter = (this.firstSide + this.secondSide) * 2;
    return perimeter;

  }
}
