package first;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

  private Square square;

  @Before
  public void setUp() {
    this.square = new Square(5);
  }

  @Test
  public void testPerimeter() {
    assertThat(20, is(square.getPerimeter()));
  }

  @Test
  public void testArea() {
    assertThat(25, is(square.getArea()));
  }
}
