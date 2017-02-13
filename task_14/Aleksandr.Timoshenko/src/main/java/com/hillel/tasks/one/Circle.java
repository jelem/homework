package com.hillel.tasks.one;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double square() {
    return Math.pow((Math.PI * this.radius), 2);
  }

  @Override
  public double perimeter() {
    return 2 * (Math.PI * this.radius);
  }

  @Override
  public String toString() {
    return "Circle";
  }
}
