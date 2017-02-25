package figure;

public class Square extends Figure {

  private int side;

  public Square(int side) {
    this.side = side;
  }

  @Override
  public double perimetr() {
    double perimetr = side * 4;
    return perimetr;
  }

  @Override
  public double square() {
    double square = side * side;
    return square;
  }
}
