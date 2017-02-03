package com.hillel.geometry;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


import org.junit.Before;
import org.junit.Test;

public class GeometryTest {

  Figure rectangle;
  Figure square;
  Figure circle;

  @Before
  public void setUp() {
    rectangle = new Rectangle(2, 3);
    square = new Square(5);
    circle = new Circle(3);
  }

  @Test
  public void rectangleSquareTst() {
    assertThat(rectangle.square(), is(6.0));
  }

  @Test
  public void rectanglePerimeterTest() {
    assertThat(rectangle.perimeter(), is(10.0));
  }

  @Test
  public void squareSquareTest() {
    assertThat(square.square(), is(25.0));
  }

  @Test
  public void squarePerimeterTest() {
    assertThat(square.perimeter(), is(20.0));
  }

  @Test
  public void circleSquareTest() {
    assertThat(circle.square(), is(28.274333882308138));
  }

  @Test
  public void circlePerimeterTest() {
    assertThat(circle.perimeter(), is(18.84955592153876));
  }

}
