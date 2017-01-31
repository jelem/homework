package com.hillel.tasks.first;

public class Triangle implements Figure {

  private double base;
  private double firstSide;
  private double secondSide;

  public Triangle(double base, double firstSide, double secondSide) {
    this.base = base;
    this.firstSide = firstSide;
    this.secondSide = secondSide;
  }

  @Override
  public double perimeter() {
    if (this.base < this.firstSide + this.secondSide) {
      System.out.println("Error! Base - it is main side!");
      return 0;
    }
    double perimeter = this.base + this.firstSide + this.secondSide;
    return perimeter;
  }

  @Override
  public double area() {
    if (this.base < this.firstSide + this.secondSide) {
      System.out.println("Error! Base - it is main side!");
      return 0;
    }
    double height = (2 / base) * Math.sqrt(
        this.perimeter() * (this.perimeter() - this.base) * (this.perimeter()
            - this.firstSide) * (this.perimeter() - this.secondSide));
    double area = 0.5 * (this.base * height);

    return Math.round(area);
  }
}
