package com.hillel.tasks.first;


import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestTasksFirst {
  Square square;
  Rectangle rectangle;
  Circle circle;

  @Before
  public void setUp() {
    square = new Square(3);
    rectangle = new Rectangle(4, 5);
    circle = new Circle(4);

  }

  @Test
  public void TestAreaSquare() {
    assertThat(square.area(), is(9.0));
  }

  @Test
  public void testPerimeterSquare() {

    assertThat(square.perimeter(), is(12.0));
  }

  @Test
  public void TestAreaRectangle() {

    assertThat(rectangle.area(), is(20.0));
  }

  @Test
  public void testPerimeterRectangle() {
    assertThat(rectangle.perimeter(), is(18.0));
  }

  @Test
  public void TestAreaCircle() {
    assertThat(circle.area(), is(50.0));
  }

  @Test
  public void testPerimeterCircle() {
    assertThat(circle.perimeter(), is(25.0));
  }
}
