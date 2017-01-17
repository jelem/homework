import com.hillel.tasks.Fibonacci;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class FibonacciTest {

  private Integer inputElement;
  private Integer expectedResult;

  private Fibonacci fibonacci;

  public FibonacciTest(Integer inputElement, Integer expectedResult) {
    this.inputElement = inputElement;
    this.expectedResult = expectedResult;
  }

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Parameterized.Parameters
  public static Collection fibonacciNumbers() {
    return Arrays.asList(new Object[][] {
      {1, 1},
      {2, 1},
      {3, 2},
      {4, 3},
      {5, 5},
      {6, 8},
      {7, 13},
      {8, 21},
      {9, 34},
      {10, 55}
    });
  }

  @Test
  public void testIterative() {
    int result = fibonacci.iterative(inputElement);
    assertThat(result, is(expectedResult));
  }

  @Test
  public void testRecursive() {
    int result = fibonacci.recursive(inputElement);
    assertThat(result, is(expectedResult));
  }
}
