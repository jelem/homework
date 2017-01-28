package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayTasksTest {

  private ArrayTasks arrayTasks;

  @Before
  public void setUp() {
    this.arrayTasks = new ArrayTasks();
  }

  @Test
  public void testMerge() {
    int[] result = arrayTasks.merge(new int[]{1, 3, 5}, new int[]{2, 4, 8, 9, 12});
    assertThat(new int[]{1, 2, 3, 4, 5, 8, 9, 12}, is(result));
  }

  @Test
  public void testExistReturnTrue() {
    boolean result = arrayTasks.sumExists(new int[]{1, 5, 7, 9, 12}, 12);
    assertThat(true, is(result));
  }

  @Test
  public void testExistReturnFalse() {
    boolean result = arrayTasks.sumExists(new int[]{1, 5, 7, 9, 12}, 3);
    assertThat(false, is(result));
  }
}
