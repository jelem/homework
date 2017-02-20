package figure;

public class Circle extends Figure {

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double perimetr() {
    double perimetr = 2 * Math.PI * radius;
    return perimetr;
  }

  @Override
  public double square() {
    double square = Math.PI * radius * radius;
    return square;
  }
}
