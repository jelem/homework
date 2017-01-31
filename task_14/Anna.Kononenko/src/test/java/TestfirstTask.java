import figura.Circle;
import figura.Square;
import figura.Triangle;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestfirstTask {

  Circle circle;
  Square square;
  Triangle triangle;

  @Before
  public void setUp() {
    triangle = new Triangle(8, 3, 5);
    circle = new Circle(6);
    square = new Square(2, 4);
  }

  @Test
  public void testAreaSquare() {
    assertThat(square.area(), is(8.0));
  }

  @Test
  public void testPerimeterSquare() {
    assertThat(square.perimeter(), is(12.0));
  }

  @Test
  public void testTriangleSquare() {
    assertThat(triangle.area(), is(135.0));
  }

  @Test
  public void testTrianglePerimeter() {
    assertThat(triangle.perimeter(), is(16.0));
  }

  @Test
  public void testCircleArea() {
    assertThat(circle.area(), is(113.0));
  }

  @Test
  public void testCirclePerimeter() {
    assertThat(circle.perimeter(), is(38.0));
  }

}
