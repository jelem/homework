import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.tasks.BinarySearch;
import org.junit.Before;
import org.junit.Test;
public class BinarySearchTest {
  BinarySearch binarySearch;

  @Before
  public void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void existsFirstTest() {

    int[] array = {1, 4, 7, 9, 10, 13, 16, 45, 56, 67, 78};
    int number = 67;
    assertThat(binarySearch.exists(array, number), is(true));
  }

  @Test
  public void existsSecondTest() {
    int[] array = {1, 4, 7, 9, 10, 13, 16, 45, 56, 67, 78};
    int number = 34;
    assertThat(binarySearch.exists(array, number), is(false));
  }

}
