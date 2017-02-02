package com.hillel.tasks.first;

public class Rectangle implements Figure {
  private double SideA;
  private double SideB;

  public Rectangle(double SideA, double SideB) {
    this.SideA = SideA;
    this.SideB = SideB;
  }

  @Override
  public double area() {
    double area = this.SideA * this.SideB;
    return area;
  }

  @Override
  public double perimeter() {
    double perimeter = (this.SideA + this.SideB) * 2;
    return perimeter;
  }
}
