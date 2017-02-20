package complex;

public class Complex {

  double real = 0;
  double imaginary = 0;

  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public Complex add(Complex number) {
    double resultReal = this.real + number.real;
    double resultImaginary = this.imaginary + number.imaginary;

    Complex resultComplex = new Complex(resultReal, resultImaginary);

    return resultComplex;

  }

  public Complex subtraction(Complex number) {
    double resultReal = this.real - number.real;
    double resultImaginary = this.imaginary - number.imaginary;

    Complex resultComplex = new Complex(resultReal, resultImaginary);

    return resultComplex;
  }

  public Complex multiplication(Complex number) {
    double resultReal = this.real * number.real - this.imaginary * number.imaginary;
    double resultImaginary = this.imaginary * number.real + this.real * number.imaginary;

    Complex resultComplex = new Complex(resultReal, resultImaginary);

    return resultComplex;

  }

  public Complex division(Complex number) {
    double resultReal = ((this.real * number.real + this.imaginary * number.imaginary) / (
        number.real * number.real
            + number.imaginary * number.imaginary));
    double resultImaginary = ((this.imaginary * number.real - this.real * number.imaginary) / (
        number.real * number.real + number.imaginary * number.imaginary));

    Complex resultComplex = new Complex(resultReal, resultImaginary);

    return resultComplex;
  }

  public Complex sqrt() {
    double resultReal = Math
        .sqrt((this.real * this.real + this.imaginary * this.imaginary + this.real) / 2);
    double resultImaginary = Math
        .sqrt((this.real * this.real + this.imaginary * this.imaginary - this.real) / 2);

    Complex resultComplex = new Complex(resultReal, resultImaginary);

    return resultComplex;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    Complex complex = (Complex) object;

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

  @Override
  public String toString() {
    return "complex.complex{"
        +
        "real="
        +
        real
        +
        ", imaginary="
        +
        imaginary
        +
        '}';
  }
}
