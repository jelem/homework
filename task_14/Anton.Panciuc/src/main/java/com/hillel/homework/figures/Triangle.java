package com.hillel.homework.figures;


public class Triangle implements Figure {

  private double thirdSide;
  private double firstSide;
  private double secondSide;

  public Triangle(double thirdSide, double firstSide, double secondSide) {
    this.thirdSide = thirdSide;
    this.firstSide = firstSide;
    this.secondSide = secondSide;
  }

  @Override
  public double perimeter() {

    double perimeter = this.thirdSide + this.firstSide + this.secondSide;
    return perimeter;
  }

  @Override
  public double area() {

    double height = (2 / thirdSide) * Math.sqrt(
        this.perimeter() * (this.perimeter() - this.thirdSide) * (this.perimeter()
            - this.firstSide) * (this.perimeter() - this.secondSide));
    double area = 0.5 * (this.thirdSide * height);

    return Math.round(area);
  }
}
