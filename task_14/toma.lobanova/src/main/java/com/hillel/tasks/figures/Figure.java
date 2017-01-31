package com.hillel.tasks.figures;

import java.text.DecimalFormat;

public abstract class Figure {
  protected double sideFirst;
  protected double sideSecond;

  public Figure(double first, double second) {
    sideFirst = first;
    sideSecond = second;
  }

  public abstract String showFigure();

  public abstract void findSquare();

  public abstract void findPerimeter();
}
