package first;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CircleTest {

  private Circle circle;

  @Before
  public void setUp() {
    this.circle = new Circle(10);
  }

  @Test
  public void testPerimeter() {
    assertThat(60, is(circle.getPerimeter()));
  }

  @Test
  public void testArea() {
    assertThat(300, is(circle.getArea()));
  }
}
