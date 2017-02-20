package figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FigureTest {

  Figure circle;
  Figure square;
  Figure rectangle;

  @Before
  public void setUp() {
    circle = new Circle(3);
    square = new Square(4);
    rectangle = new Rectangle(3, 4);
  }

  @Test
  public void circlePerimetrTest() {
    assertThat(circle.perimetr(), is(18.84955592153876));
  }

  @Test
  public void circleSquareTesr() {
    assertThat(circle.square(), is(28.274333882308138));
  }

  @Test
  public void squarePerimetrTest() {
    assertThat(square.perimetr(), is(16.0));
  }

  @Test
  public void squareSquareTest() {
    assertThat(square.square(), is(16.0));
  }

  @Test
  public void rectanglePerimetrTest() {
    assertThat(rectangle.perimetr(), is(14.0));
  }

  @Test
  public void rectangleSquareTest() {
    assertThat(rectangle.square(), is(12.0));
  }
}
