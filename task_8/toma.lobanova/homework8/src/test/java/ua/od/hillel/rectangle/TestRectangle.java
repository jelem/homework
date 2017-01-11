package ua.od.hillel.rectangle;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestRectangle {
  Rectangle rect;

  @Before
  public void setUp() {
    rect = new Rectangle();
  }

  @Test
  public void testSetSides() {
    rect.setSideA(56);
    int result = rect.getSideA();
    assertThat(result, is(56));
    rect.setSideB(23);
    result = rect.getSideB();
    assertThat(result, is(23));
  }

  @Test
  public void testCountSquare() {
    rect.setSideA(3);
    rect.setSideB(5);
    int square = rect.countSquare();
    assertThat(square, is(15));
  }

  @Test
  public void testCountPerimeter() {
    rect.setSideA(30);
    rect.setSideB(50);
    int perimeter = rect.countPerimeter();
    assertThat(perimeter, is(160));
  }

  @Test
  public void testIsSquare() {
    rect.setSideA(30);
    rect.setSideB(50);
    boolean result = rect.isSquare();
    assertThat(result, is(false));
    rect.setSideB(30);
    result = rect.isSquare();
    assertThat(result, is(true));
  }
}
