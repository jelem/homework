package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestArrayTasks {

  ArrayTasks arrayTasks;

  @Before
  public void setUp() {
    arrayTasks = new ArrayTasks();
  }

  @Test
  public void testClone() {
    int[] firstArray = {5, 4, 3, 2, 1};
    int[] secondArray = {1, 7, 8};
    int[] result = {1, 1, 2, 3, 4, 5, 7, 8};

    int[] getResult = arrayTasks.merge(firstArray, secondArray);
    assertThat(getResult, is(result));
  }

  @Test
  public void testSum() {
    int[] array = {5, 4, 3, 2, 1};
    int sum = 7;

    assertThat(arrayTasks.sumExists(array, sum), is(true));
  }

  @Test
  public void testFalseSum() {
    int[] array = {5, 4, 3, 2, 1};
    int sum = 1;

    assertThat(arrayTasks.sumExists(array, sum), is(false));
  }


}
