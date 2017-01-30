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
    return (int) (2 * Math.PI) * this.radius;
  }

  @Override
  public int getArea() {
    return (int) Math.PI * (this.radius * this.radius);
  }
}
