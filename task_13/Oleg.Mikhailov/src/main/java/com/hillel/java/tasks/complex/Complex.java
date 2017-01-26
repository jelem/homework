package com.hillel.java.tasks.complex;

public class Complex {

  private double real;
  private double imaginary;

  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public Complex() {
    this.real = 0;
    this.real = 0;
  }

  public Complex add(Complex complex) {
    double resultReal = (this.real + complex.real);
    double resultImaginary = (this.imaginary + complex.imaginary);
    return new Complex(resultReal, resultImaginary);
  }

  public Complex sub(Complex complex) {
    double resultReal = (this.real - complex.real);
    double resultImaginary = (this.imaginary - complex.imaginary);
    return new Complex(resultReal, resultImaginary);
  }

  public Complex mux(Complex complex) {
    double resultReal = this.real * complex.real + (-1) * this.imaginary * complex.imaginary;
    double resultImaginary = this.real * complex.imaginary + this.imaginary * complex.real;
    return new Complex(resultReal, resultImaginary);
  }

  public Complex div(Complex complex) {
    double tmp = complex.real * complex.real + (-1) * complex.real * complex.imaginary
        + complex.imaginary * complex.real + complex.imaginary * complex.imaginary;
    double resultReal =
        (this.real * complex.real + this.imaginary * complex.imaginary) / (tmp);
    double resultImaginary =
        ((-1) * this.real * complex.imaginary + this.imaginary * complex.real) / (tmp);

    return new Complex(resultReal, resultImaginary);
  }

  public Complex sqrt(Complex complex) {
    double numberReal = complex.real;
    double numberImaginary = complex.imaginary;
    double resultReal = Math
        .sqrt((Math.sqrt(numberReal * numberReal + numberImaginary * numberImaginary)
            + numberReal) / 2);
    double resultImaginary = Math
        .sqrt((Math.sqrt(numberReal * numberReal + numberImaginary * numberImaginary)
            - numberReal) / 2);

    return new Complex(resultReal, resultImaginary);
  }


  public boolean equals(Complex complex) {
    if (complex == null) {
      return false;
    }
    if (this.getClass() != complex.getClass()) {
      return false;
    }
    Complex that = (Complex) complex;
    return (this.real == that.real) && (this.imaginary == that.imaginary);
  }

  public int hashCode() {
    assert false : "hashCode not designed";
    return 42;
  }


  @Override
  public String toString() {
    return "Rezult= " + real + ", " + imaginary + "i";
  }
}
