package com.hillel.homework.complex;


public class Complex {
  private double real;
  private double imaginary;

  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public Complex() {
    this.real = 0;
    this.imaginary = 0;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  @Override
  public String toString() {
    return "Result = " + real + ", " + imaginary + "i";
  }
}
