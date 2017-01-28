package complex;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ComplexTest {

  private Complex complex;

  @Before
  public void setUp() {
    complex = new Complex(5, 10);
  }

  @Test
  public void testAdditionalReturnTrue() {
    Complex sum = new Complex(10, 20);
    Complex result = complex.additional(new Complex(5, 10));
    assertThat(true, is(result.equals(sum)));
  }

  @Test
  public void testSubtractionReturnTrue() {
    Complex result = complex.subtraction(new Complex(3, 2));
    assertThat(true, is(result.equals(new Complex(2, 8))));
  }

  @Test
  public void testMultiplicationReturnTrue() {
    Complex result = complex.multiplication(new Complex(3, 2));
    assertThat(true, is(result.equals(new Complex(-5, 40))));
  }

  @Test
  public void testDivisionReturnTrue() {
    Complex result = complex.division(new Complex(2, 3));
    assertThat(true, is(result.equals(new Complex(3.076923076923077, 0.3846153846153846))));
  }

  @Test
  public void testRaceReturnTrue() {
    double result = complex.race();
    assertThat(2.06858347230649, is(result));
  }
}
