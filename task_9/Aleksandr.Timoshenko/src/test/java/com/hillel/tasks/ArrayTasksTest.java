package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArrayTasksTest {

  ArrayTasks arrayTasks;

  @Before
  public void setUp() {
    arrayTasks = new ArrayTasks();
  }

  @Test
  public void testMerge() {
    int[] a = {1, 3, 5};
    int[] b = {2, 4, 8, 9, 12};
    int[] c = {1, 2, 3, 4, 5, 8, 9, 12};
    assertThat(arrayTasks.merge(a, b), is(c));
  }

  @Test
  public void testSumExistTrue() {
    int[] a = {1, 5, 7, 9, 12};
    int sum = 12;
    assertThat(arrayTasks.sumExists(a, sum), is(true));
  }

  @Test
  public void testSumExistFalse() {
    int[] a = {1, 5, 7, 9, 12};
    int sum = 3;
    assertThat(arrayTasks.sumExists(a, sum), is(false));
  }

}
