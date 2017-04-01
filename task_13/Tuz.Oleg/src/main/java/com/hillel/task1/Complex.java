package com.hillel.task1;

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

  public Complex addition(Complex number) {
    double real = (this.real + number.real);
    double imaginary = (this.imaginary + number.imaginary);
    Complex result = new Complex(real, imaginary);
    return result;
  }

  public Complex subtraction(Complex number) {
    double real = (this.real - number.real);
    double imaginary = (this.imaginary - number.imaginary);
    Complex result = new Complex(real, imaginary);
    return result;
  }

  public Complex multiplication(Complex number) {
    double real = (this.real * number.real - this.imaginary * number.imaginary);
    double imaginary = (this.imaginary * number.real + this.real * number.imaginary);
    Complex result = new Complex(real, imaginary);
    return result;
  }

  public Complex division(Complex number) {
    double real = (this.real * number.real + this.imaginary * number.imaginary)
        / (number.real * number.real + number.imaginary * number.imaginary);
    double imaginary = (this.imaginary * number.real - this.real * number.imaginary)
        / (number.real * number.real + number.imaginary * number.imaginary);
    Complex result = new Complex(real, imaginary);
    return result;
  }

  public Complex sqrt(Complex number) {
    double real = Math.sqrt((Math.sqrt(this.real * this.real + this.imaginary * this.imaginary) + this.real) / 2);
    double imaginary = Math.sqrt((Math.sqrt(this.real * this.real + this.imaginary * this.imaginary) - this.real) / 2);
    Complex result = new Complex(real, imaginary);
    return result;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public String toString() {
    return "result = " + real + " ," + imaginary + "i";

  }
}
