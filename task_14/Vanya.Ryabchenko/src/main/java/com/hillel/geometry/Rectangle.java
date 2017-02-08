package com.hillel.geometry;


public class Rectangle extends Figure {

  private double width;
  private double length;


  public Rectangle(double width, double length) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double square() {
    return length * width;
  }

  @Override
  public double perimeter() {
    return 2 * length + 2 * width;
  }
}
