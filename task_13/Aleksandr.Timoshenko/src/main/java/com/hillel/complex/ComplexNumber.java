package com.hillel.complex;

public class ComplexNumber {

  private double imaginaryResultNumber;
  private double realResultNumber;
  private double realNumber;
  private double imaginaryNumber;

  public ComplexNumber(double realNumber, double imaginaryNumber) {
    this.realNumber = realNumber;
    this.imaginaryNumber = imaginaryNumber;
  }

  public ComplexNumber() {
    this.realNumber = 0;
    this.imaginaryNumber = 0;
  }

  public void setComplexNumber(double realNumber, double imaginaryNumber) {
    this.realNumber = realNumber;
    this.imaginaryNumber = imaginaryNumber;
  }

  public ComplexNumber addition(ComplexNumber secondComplexNumber) {
    realResultNumber = (this.realNumber + secondComplexNumber.realNumber);
    imaginaryResultNumber = this.imaginaryNumber + secondComplexNumber.imaginaryNumber;
    return new ComplexNumber(realResultNumber, imaginaryResultNumber);
  }

  public ComplexNumber subtraction(ComplexNumber secondComplexNumber) {
    realResultNumber = (this.realNumber - secondComplexNumber.realNumber);
    imaginaryResultNumber = (this.imaginaryNumber - secondComplexNumber.imaginaryNumber);
    return new ComplexNumber(realResultNumber, imaginaryResultNumber);
  }

  public ComplexNumber division(ComplexNumber complexNumber) {
    realResultNumber = ((this.realNumber * complexNumber.realNumber + this.imaginaryNumber
        * complexNumber.imaginaryNumber) / (
        (complexNumber.realNumber * complexNumber.realNumber) + (complexNumber.imaginaryNumber
            * complexNumber.imaginaryNumber)));
    imaginaryResultNumber = ((complexNumber.realNumber * this.imaginaryNumber
        - this.realNumber * complexNumber.imaginaryNumber) / (
        (complexNumber.realNumber * complexNumber.realNumber) + (complexNumber.imaginaryNumber
            * complexNumber.imaginaryNumber)));
    return new ComplexNumber(realResultNumber, imaginaryResultNumber);
  }

  public ComplexNumber multiplications(ComplexNumber complex) {
    realResultNumber =
        (this.realNumber * complex.realNumber) - (this.imaginaryNumber * complex.imaginaryNumber);
    imaginaryResultNumber = (this.realNumber * complex.imaginaryNumber
        + this.imaginaryNumber * complex.realNumber);
    return new ComplexNumber(realResultNumber, imaginaryResultNumber);
  }

  public ComplexNumber square(ComplexNumber complex) {
    realResultNumber = Math.sqrt((Math.sqrt(this.realNumber * complex.realNumber
        + this.imaginaryNumber * complex.imaginaryNumber) + this.realNumber) / 2);
    imaginaryResultNumber = Math.sqrt((Math.sqrt(this.realNumber * complex.realNumber
        + this.imaginaryNumber * complex.imaginaryNumber) - this.realNumber) / 2);
    return new ComplexNumber(realResultNumber, imaginaryResultNumber);
  }

  public boolean equals(Object complex) {
    if (complex == null) {
      return false;
    }
    if (this.getClass() != complex.getClass()) {
      return false;
    }
    ComplexNumber that = (ComplexNumber) complex;
    return (this.realResultNumber == that.realResultNumber) && (this.imaginaryResultNumber
        == that.imaginaryResultNumber);
  }

  public int hashCode() {
    assert false : "hashCode not designed";
    return 42;
  }


  @Override
  public String toString() {
    return "Rezult= " + realResultNumber + ", " + imaginaryResultNumber + "i";
  }
}
