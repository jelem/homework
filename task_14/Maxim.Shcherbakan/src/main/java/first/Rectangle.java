package first;

public class Rectangle extends Figure {

  private int oneSide;
  private int secondSide;

  public Rectangle(int oneSide, int secondSide) {
    this.oneSide = oneSide;
    this.secondSide = secondSide;
  }

  public Rectangle() {
    this.oneSide = 0;
    this.secondSide = 0;
  }

  @Override
  public int getPerimeter() {
    return (this.oneSide + this.secondSide) * 2;
  }

  @Override
  public int getArea() {
    return this.oneSide * this.secondSide;
  }
}
