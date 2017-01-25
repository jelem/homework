package com.hillel.tasks.complexnumber;

import java.lang.Math;

public class MyMath {
  public static ComplexNumber addition(ComplexNumber operand1, ComplexNumber operand2) {
    double real = operand1.getReal() + operand2.getReal();
    double imaginary = operand1.getImaginary() + operand2.getImaginary();
    return new ComplexNumber(real, imaginary);
  }

  public static ComplexNumber subtraction(ComplexNumber operand1, ComplexNumber operand2) {
    double real = operand1.getReal() - operand2.getReal();
    double imaginary = operand1.getImaginary() - operand2.getImaginary();
    return new ComplexNumber(real, imaginary);
  }

  public static ComplexNumber multiplication(ComplexNumber operand1, ComplexNumber operand2) {
    double real = operand1.getReal() * operand2.getReal() - operand1.getImaginary() * operand2.getImaginary();
    double imaginary = operand1.getReal() * operand2.getImaginary() + operand1.getImaginary() * operand2.getReal();
    return new ComplexNumber(real, imaginary);
  }

  public static ComplexNumber division(ComplexNumber operand1, ComplexNumber operand2) {
    double number1Real = operand1.getReal();
    double number1Imag = operand1.getImaginary();
    double number2Real = operand2.getReal();
    double number2Imag = operand2.getImaginary();
    double real = (number1Real * number2Real + number1Imag * number2Imag) / (number2Real * number2Real
        + number2Imag * number2Imag);
    double imaginary = (number1Imag * number2Real - number1Real * number2Imag) / (number2Real * number2Real
        + number2Imag * number2Imag);
    return new ComplexNumber(real, imaginary);
  }

  public ComplexNumber radix(ComplexNumber operand) {
    double numberReal = operand.getReal();
    double numberImaginary = operand.getImaginary();
    double sqrtReal = Math.sqrt((Math.sqrt(numberReal * numberReal + numberImaginary * numberImaginary)
        + numberReal) / 2);
    double sqrtImaginary = Math.sqrt((Math.sqrt(numberReal * numberReal + numberImaginary * numberImaginary)
        - numberReal) / 2);
    return new ComplexNumber(sqrtReal, sqrtImaginary);
  }
}
