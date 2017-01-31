package com.hillel.tasks.complexnumber;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ComplexNumber {
  private double real;
  private double imaginary;

  public ComplexNumber(double real, double imaginary) {
    setReal(real);
    setImaginary(imaginary);
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  @Override
  public String toString() {
    DecimalFormat df = new DecimalFormat("##.##");
    df.setRoundingMode(RoundingMode.HALF_UP);
    return "(" + df.format(real).replace(",", ".") + ", " + df.format(imaginary).replace(",", ".") + ")";
  }
}
