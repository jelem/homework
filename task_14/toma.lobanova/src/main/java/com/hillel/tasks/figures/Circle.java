package com.hillel.tasks.figures;

public class Circle extends Figure {
  public Circle(double first) {
    super(first, 0);
  }

  @Override
  public String showFigure() {
    return "circle";
  }

  @Override
  public void findSquare() {
    System.out.println(String.format("The square is %.2f", Math.PI * sideFirst * sideFirst));
  }

  @Override
  public void findPerimeter() {
    System.out.println(String.format("The perimeter is %.2f", Math.PI * 2 * sideFirst));
  }
}
