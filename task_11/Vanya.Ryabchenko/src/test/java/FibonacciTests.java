import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.tasks.Fibonacci;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTests {

  Fibonacci fibonacci;

  @Before
  public void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void iterativeTest() {
    assertThat(fibonacci.iterative(6), is(8));
  }

  @Test
  public void recursiveTest() {
    assertThat(fibonacci.recursive(9), is(34));
  }


}
