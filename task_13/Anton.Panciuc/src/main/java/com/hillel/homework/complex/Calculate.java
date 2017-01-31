package com.hillel.homework.complex;


public class Calculate {
  public static Complex add(Complex number1, Complex number2) {
    double real = number1.getReal() + number2.getReal();
    double imaginary = number1.getImaginary() + number2.getImaginary();
    return new Complex(real, imaginary);
  }

  public static Complex subt(Complex number1, Complex number2) {
    double real = number1.getReal() - number2.getReal();
    double imaginary = number1.getImaginary() - number2.getImaginary();
    return new Complex(real, imaginary);
  }

  public static Complex mult(Complex number1, Complex number2) {
    double real = number1.getReal() * number2.getReal() - number1.getImaginary() * number2.getImaginary();
    double imaginary = number1.getReal() * number2.getImaginary() + number1.getImaginary() * number2.getReal();
    return new Complex(real, imaginary);
  }

  public static Complex div(Complex number1, Complex number2) {
    double number1Real = number1.getReal();
    double number1Imag = number1.getImaginary();
    double number2Real = number2.getReal();
    double number2Imag = number2.getImaginary();
    double real = (number1Real * number2Real + number1Imag * number2Imag) / (number2Real * number2Real
        + number2Imag * number2Imag);
    double imaginary = (number1Imag * number2Real - number1Real * number2Imag) / (number2Real * number2Real
        + number2Imag * number2Imag);
    return new Complex(real, imaginary);
  }

  public Complex sqrt(Complex number) {
    double numberReal = number.getReal();
    double numberImaginary = number.getImaginary();
    double sqrtReal = Math.sqrt((Math.sqrt(numberReal * numberReal + numberImaginary * numberImaginary)
        + numberReal) / 2);
    double sqrtImaginary = Math.sqrt((Math.sqrt(numberReal * numberReal + numberImaginary * numberImaginary)
        - numberReal) / 2);
    return new Complex(sqrtReal, sqrtImaginary);
  }


  public static void main(String[] args) {
    Complex number1 = new Complex(3,5);
    Complex number2 = new Complex(4,7);

    System.out.println(add(number1, number2));
  }
}