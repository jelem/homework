package com.hillel.tasks.first;


public class Circle implements Figure {

  private static final double PI = Math.PI;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    double area = PI * radius * radius;
    return Math.round(area);
  }

  @Override
  public double perimeter() {
    double perimeter = 2 * PI * radius;
    return Math.round(perimeter);

  }

}

