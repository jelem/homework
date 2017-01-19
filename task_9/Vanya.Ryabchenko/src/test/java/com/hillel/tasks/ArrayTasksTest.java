package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.tasks.ArrayTasks;
import org.junit.Before;
import org.junit.Test;

public class ArrayTasksTest {

  ArrayTasks arrayTasks;

  @Before
  public void setUp() {
    arrayTasks = new ArrayTasks();
  }

  @Test
  public void testMerge() {
    int[] firstArray = {1, 6, 7, 9,};
    int[] secondArray = {2, 4, 8, 10};
    assertThat(arrayTasks.merge(firstArray,secondArray), is(new int[]{1, 2, 4, 6, 7, 8, 9, 10}));
  }

  @Test
  public void testSumExistsTrue() {
    int[] array = {1,2,4,7,9,12,15};
    int sum = 14;
    assertThat(arrayTasks.sumExists(array,sum), is(true));
  }

  @Test
  public void testSumExistFalse() {
    int[] array = {2,4,7,9,12,15};
    int sum = 10;
    assertThat(arrayTasks.sumExists(array,sum), is(false));
  }
}
