package first;

public class Square extends Figure {

  private int side;

  public Square(int side) {
    this.side = side;
  }

  public Square() {
    this.side = 0;
  }

  @Override
  public int getPerimeter() {
    return 4 * this.side;
  }

  @Override
  public int getArea() {
    return this.side * this.side;
  }
}
