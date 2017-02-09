package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayTasksTest {

  ArrayTasks task1;
  ArrayTasks task3;

  @Before

  public void setUp() {
    task1 = new ArrayTasks();
    task3 = new ArrayTasks();
  }

  @Test
  public void merge0() {
    int[] firstArray = {1, 3, 5};
    int[] secondArray = {2, 4, 8, 9, 12};
    int[] array = {1, 2, 3, 4, 5, 8, 9, 12};
    assertThat(task1.merge(firstArray, secondArray), is(array));
  }

  @Test
  public void merge1() {
    int[] firstArray = {2, 5, 10, 13, 85};
    int[] secondArray = {1, 3};
    int[] array = {1, 2, 3, 5, 10, 13, 85};
    assertThat(task1.merge(firstArray, secondArray), is(array));
  }

  @Test
  public void merge2() {
    int[] firstArray = {2, 2, 2};
    int[] secondArray = {2, 2};
    int[] array = {2, 2, 2, 2, 2};
    assertThat(task1.merge(firstArray, secondArray), is(array));
  }

  @Test
  public void sumExists0() {
    int[] array1 = {1, 5, 7, 9, 12};
    int sum = 12;
    assertThat(task3.sumExists(array1, sum), is(true));
  }

  @Test
  public void sumExists1() {
    int[] array1 = {1, 5, 7, 9, 12};
    int sum = 3;
    assertThat(task3.sumExists(array1, sum), is(false));
  }

  @Test
  public void sumExists2() {
    int[] array1 = {2, 2, 2, 2, 2, 2};
    int sum = 4;
    assertThat(task3.sumExists(array1, sum), is(true));
  }

}
