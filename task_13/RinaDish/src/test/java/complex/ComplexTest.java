package complex;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
public class ComplexTest {

  Complex firstNumber;
  Complex secondNumber;

  @Before
  public void setUp() {
    firstNumber = new Complex(4, 5);
    secondNumber = new Complex(5, 4);
  }

  @Test
  public void addTest() {
    Complex resultComplex = firstNumber.add(secondNumber);
    assertThat(resultComplex.equals(new Complex(9, 9)), is(true));
  }

  @Test
  public void substructionTest() {
    Complex resultComplex = firstNumber.subtraction(secondNumber);
    assertThat(resultComplex.equals(new Complex(-1, 1)), is(true));
  }

  @Test
  public void multiplicationTest() {
    Complex resultComplex = firstNumber.multiplication(secondNumber);
    assertThat(resultComplex.equals(new Complex(0, 41)), is(true));
  }

  @Test
  public void divisionTest() {
    Complex resultComlex = firstNumber.division(secondNumber);
    assertThat(resultComlex.equals(new Complex(0.975609756097561, 0.21951219512195122)), is(true));
  }

  @Test
  public void sqrtTest() {
    Complex resultComlex = firstNumber.sqrt();
    assertThat(resultComlex.equals(new Complex(4.743416490252569, 4.301162633521313)), is(true));
  }

}
