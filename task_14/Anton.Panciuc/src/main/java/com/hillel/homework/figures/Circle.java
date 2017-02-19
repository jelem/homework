package com.hillel.homework.figures;


public class Circle implements Figure {

  private static final double PI = Math.PI;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.round(PI * radius * radius);
  }

  @Override
  public double perimeter() {
    return Math.round(2 * PI * radius);
  }
}
