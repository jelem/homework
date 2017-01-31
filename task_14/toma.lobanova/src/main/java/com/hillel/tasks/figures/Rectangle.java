package com.hillel.tasks.figures;

public class Rectangle extends Figure {
  public Rectangle(double first, double second) {
    super(first, second);
  }

  @Override
  public String showFigure() {
    return "rectangle";
  }

  @Override
  public void findSquare() {
    System.out.println(String.format("The square is %.2f", sideFirst * sideSecond));
  }

  @Override
  public void findPerimeter() {
    System.out.println(String.format("The perimeter is %.2f", (sideFirst + sideSecond) * 2));
  }
}
