package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayTasksTest {
  ArrayTasks arrayTasks;

  @Before
  public void setUp() {
    arrayTasks = new ArrayTasks();
  }

  @Test
  public void testMerge() {
    int[] arrayFirst = {11, 23, 45, 67, 8, 0, -1, -4};
    int[] arraySecond = {3, 6, 7, -90, 0, 23};
    int[] newArray = {-90, -4, -1, 0, 0, 3, 6, 7, 8, 11, 23, 23, 45, 67};
    int[] result = arrayTasks.merge(arrayFirst, arraySecond);
    assertThat(result, is(newArray));
  }

  @Test
  public void testSumExistsPositive() {
    int[] arrayFirst = {11, 23, 45, 67, 8, 0, -1, -4};
    int sum = 8;
    boolean actualResult = arrayTasks.sumExists(arrayFirst, sum);
    assertThat(actualResult, is(true));
    int[] arraySecond = {-90, -4, -1, 0, 0, 3, 6, 7, 8, 11, 23, 23, 45, 67};
    sum = -23;
    actualResult = arrayTasks.sumExists(arraySecond, sum);
    assertThat(actualResult, is(true));
  }

  @Test
  public void testSumExistsNegative() {
    int[] arrayFirst = {11, 23, 45, 67, 8, 0, -1, -4};
    int sum = 0;
    boolean actualResult = arrayTasks.sumExists(arrayFirst, sum);
    assertThat(actualResult, is(false));
    int[] arraySecond = {-90, -4, -1, 0, 0, 3, 6, 7, 8, 11, 23, 23, 45, 67};
    sum = -95;
    actualResult = arrayTasks.sumExists(arraySecond, sum);
    assertThat(actualResult, is(false));
  }

}
