package com.hillel.tasks.oneTest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.tasks.one.Circle;
import com.hillel.tasks.one.Rectangle;
import com.hillel.tasks.one.Square;
import org.junit.Before;
import org.junit.Test;

public class ShapeTest {

  Rectangle rectengle;
  Circle circle;
  Square square;

  @Before
  public void setUp() {
    rectengle = new Rectangle(5, 3);
    circle = new Circle(7);
    square = new Square(5);
  }

  @Test
  public void testRectanglePerimeter() {
    assertThat(rectengle.perimeter(), is(16D));
  }

  @Test
  public void testRectangleSquare() {
    assertThat(rectengle.square(), is(15D));
  }

  @Test
  public void testCirclePerimeter() {
    assertThat(circle.perimeter(), is(43.982297150257104));
  }

  @Test
  public void testCircleSquare() {
    assertThat(circle.square(), is(483.61061565337855));
  }

  @Test
  public void testSquarePerimeter() {
    assertThat(square.perimeter(), is(20D));
  }

  @Test
  public void testSquareSqare() {
    assertThat(square.square(), is(25D));
  }

}
