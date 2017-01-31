package com.hillel.tasks.first;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestFistTask {

  Triangle triangle;
  Circle circle;
  Square square;

  @Before
  public void setUp() {
    triangle = new Triangle(9, 3, 5);
    circle = new Circle(5);
    square = new Square(1, 5);
  }

  @Test
  public void testAreaSquare() {
    assertThat(square.area(), is(5.0));
  }

  @Test
  public void testPerimeterSquare() {
    assertThat(square.perimeter(), is(12.0));
  }

  @Test
  public void testAreaCircle() {
    assertThat(circle.area(), is(79.0));
  }

  @Test
  public void testPerimeterCircle() {
    assertThat(circle.perimeter(), is(31.0));
  }

  @Test
  public void testAreaTriangle() {
    assertThat(triangle.area(), is(151.0));
  }

  @Test
  public void testPeremeterTriangle() {
    assertThat(triangle.perimeter(), is(17.0));
  }

  @Test
  public void testIncorrectTriangle() {
    Figure incorrectTriangle = new Triangle(2, 5, 6);
    assertThat(incorrectTriangle.perimeter(), is(0.0));
  }

}
