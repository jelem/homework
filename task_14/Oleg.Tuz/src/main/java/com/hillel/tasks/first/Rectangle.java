package com.hillel.tasks.first;

public class Rectangle implements Figure {
  private double sideA;
  private double sideB;

  public Rectangle(double sideA, double sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  @Override
  public double area() {
    double area = this.sideA * this.sideB;
    return area;
  }

  @Override
  public double perimeter() {
    double perimeter = (this.sideA + this.sideB) * 2;
    return perimeter;
  }
}
