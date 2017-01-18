package com.hillel.tasks;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestArrayTasks {
  ArrayTasks arrayTasks;

  @Before
  public void setUp() {
    arrayTasks = new ArrayTasks();
  }

  @Test
  public void testClone() {
    int[] firstArray = {1, 5, 7};
    int[] secondArray = {6, 9, 10, 15, 17};
    int[] result = {1, 5, 6, 7, 9, 10, 15, 17};

    int[] getResult = arrayTasks.merge(firstArray, secondArray);
    assertThat(getResult, is(result));
  }

  @Test
  public void testSum() {
    int[] array = {1, 3, 4, 5, 9};
    int sum = 9;

    assertThat(arrayTasks.sumExists(array, sum), is(true));
  }

  @Test
  public void testFalseSum() {
    int[] array = {1, 3, 4, 5, 9};
    int sum = 20;

    assertThat(arrayTasks.sumExists(array, sum), is(false));
  }
}
