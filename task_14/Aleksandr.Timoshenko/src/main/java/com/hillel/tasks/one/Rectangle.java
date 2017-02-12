package com.hillel.tasks.one;

public class Rectangle extends Shape {

  private double saidA;
  private double saidB;

  public Rectangle(double saidA, double saidB) {
    this.saidA = saidA;
    this.saidB = saidB;
  }

  @Override
  public double square() {
    return saidA * saidB;
  }

  @Override
  public double perimeter() {
    return 2 * (saidA + saidB);
  }

  @Override
  public String toString() {
    return "Rectangle";
  }
}
