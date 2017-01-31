package com.hillel.complex;

public class Complex {

  private double real = 0;
  private double imaginary = 0;


  public Complex(double real, double imaginary) {
    this.imaginary = imaginary;
    this.real = real;
  }

  public Complex add(Complex number) {
    double imaginaryResult = number.imaginary + this.imaginary;
    double realResult = number.real + this.real;
    Complex result = new Complex(realResult, imaginaryResult);
    return result;
  }

  public Complex subtraction(Complex number) {
    double imaginaryResult = this.imaginary - number.imaginary;
    double realResult = this.real - number.real;
    Complex result = new Complex(realResult, imaginaryResult);
    return result;
  }

  public Complex multiplication(Complex number) {
    double imaginaryResult = this.real * number.imaginary + number.real * this.imaginary;
    double realResult = this.real * number.real - this.imaginary * number.imaginary;
    Complex result = new Complex(realResult, imaginaryResult);
    return result;
  }

  public Complex division(Complex number) {
    double imaginaryResult =
        (number.real * this.imaginary - this.real * number.imaginary) / (number.real * number.real
            + number.imaginary * number.imaginary);

    double realResult =
        (this.real * number.real + this.imaginary * number.imaginary) / (number.real * number.real
            + number.imaginary * number.imaginary);

    Complex result = new Complex(realResult, imaginaryResult);
    return result;
  }

  public Complex sqrt() {
    double realResult = Math
        .sqrt((Math.sqrt(this.real * this.real + this.imaginary * this.imaginary) + this.real) / 2);
    double imaginaryResult = Math
        .sqrt((Math.sqrt(this.real * this.real + this.imaginary * this.imaginary) - this.real) / 2);
    Complex result = new Complex(realResult, imaginaryResult);
    return result;

  }

  @Override
  public String toString() {
    String result = this.real + "+" + this.imaginary + "i";
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Complex complex = (Complex) obj;

    if (Double.compare(complex.real, real) != 0) {
      return false;
    }
    return Double.compare(complex.imaginary, imaginary) == 0;

  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(real);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(imaginary);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
