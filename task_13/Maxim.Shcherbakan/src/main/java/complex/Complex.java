package complex;

import java.util.Objects;

public class Complex {

  private double first;
  private double second;

  public Complex(double first, double second) {
    this.first = first;
    this.second = second;
  }

  public Complex() {
    this.first = 0;
    this.second = 0;
  }

  public Complex multiplication(Complex number) {
    double first = this.first * number.first - this.second * number.second;
    double second = this.first * number.second + this.second * number.first;
    return new Complex(first, second);
  }

  public Complex division(Complex number) {
    return this.multiplication(number.reciprocal());
  }

  public Complex reciprocal() {
    double scale = this.first * this.first + this.second * this.second;
    return new Complex(this.first / scale, -this.second / scale);
  }

  public Complex additional(Complex number) {
    double first = this.first + number.first;
    double second = this.second + number.second;
    return new Complex(first, second);
  }

  public Complex subtraction(Complex number) {
    double first = this.first - number.first;
    double second = this.second - number.second;
    return new Complex(first, second);
  }

  public double race() {
    Complex cos = this.cos();
    Complex sin = this.sin();
    Complex additional = cos.additional(sin);
    return additional.phase();
  }

  public double phase() {
    return Math.atan2(this.second, this.first);
  }

  public Complex sin() {
    return new Complex(Math.sin(this.first) * Math.cosh(this.second),
        Math.cos(this.first) * Math.sinh(this.second));
  }

  public Complex cos() {
    return new Complex(Math.cos(this.first) * Math.cosh(this.second),
        -Math.sin(this.first) * Math.sinh(this.second));
  }

  public double getFirst() {
    return this.first;
  }

  public double getSecond() {
    return this.second;
  }

  public String toString() {
    return this.first + " + " + this.second + "i";
  }

  public boolean equals(Object number) {
    if (number == null) {
      return false;
    }
    if (this.getClass() != number.getClass()) {
      return false;
    }
    Complex that = (Complex) number;
    return (this.first == that.first) && (this.second == that.second);
  }

  public int hashCode() {
    return Objects.hash(this.first, this.second);
  }
}
