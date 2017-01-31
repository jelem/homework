import org.junit.Before;
import org.junit.Test;

import com.hillel.tasks.BinarySearch;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

  BinarySearch binarySearch;
  int[] array = {3, 4, 8, 19, 25};

  @Before
  public void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void testExistsPositive() {
    int number = 8;
    assertThat(binarySearch.exists(array, number), is(true));
  }

  @Test
  public void testExistsNegative() {
    int number = 7;
    assertThat(binarySearch.exists(array, number), is(false));
  }
}
