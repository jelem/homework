package first;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

  private Rectangle rectangle;

  @Before
  public void setUp() {
    this.rectangle = new Rectangle(5, 10);
  }

  @Test
  public void testPerimeter() {
    assertThat(30, is(rectangle.getPerimeter()));
  }

  @Test
  public void testArea() {
    assertThat(50, is(rectangle.getArea()));
  }
}