package first;

public class Circle extends Figure {

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public Circle() {
    this.radius = 0;
  }

  @Override
  public int getPerimeter() {
    return (int) (2 * 3.14) * this.radius;
  }

  @Override
  public int getArea() {
    return (int) 3.14 * (this.radius * this.radius);
  }
}
