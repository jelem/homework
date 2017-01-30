import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.complex.Complex;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {

  @Test
  public void addTest() {
    Complex firstNumber = new Complex(2,5);
    Complex secondNumber = new Complex(3,5);
    Complex addResult = firstNumber.add(secondNumber);


  }

}
