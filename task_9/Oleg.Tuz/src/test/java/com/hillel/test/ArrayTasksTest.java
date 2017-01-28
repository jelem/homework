import org.junit.Before;
import org.junit.Test;

import com.hillel.tasks.ArrayTasks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayTasksTest {

  ArrayTasks arrayTasks;

  @Before
  public void setUp() {
    arrayTasks = new ArrayTasks();
  }

  @Test
  public void testMerge() {
    int[] firstArray = {1, 3, 5};
    int[] secondArray = {2, 4, 8, 9, 12};
    int[] result = {1, 2, 3, 4, 5, 8, 9, 12};

    int[] actualResult = arrayTasks.merge(firstArray, secondArray);

    assertThat(actualResult, is(equalTo(result)));
  }

  @Test
  public void testSumExistsPositive() {
    int[] array = {1, 5, 7, 9, 12};
    int sum = 12;

    assertThat(arrayTasks.sumExists(array, sum), is(true));
  }

  @Test
  public void testSumExistsNegative() {
    int[] array = {1, 5, 7, 9, 12};
    int sum = 3;

    assertThat(arrayTasks.sumExists(array, sum), is(false));
  }
}