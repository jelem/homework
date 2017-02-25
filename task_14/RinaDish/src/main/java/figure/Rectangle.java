package figure;

public class Rectangle extends Figure {

  int sideA;
  int sideB;

  public Rectangle(int sideA, int sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  @Override
  public double perimetr() {
    double perimetr;
    perimetr = sideA * 2 + sideB * 2;
    return perimetr;
  }

  @Override
  public double square() {
    double square;
    square = sideA * sideB;
    return square;
  }
}
