package com.hillel.tasks.figures;

public class Square extends Rectangle {
  public Square(double first) {
    super(first, first);
  }

  @Override
  public String showFigure() {
    return "square";
  }
}
