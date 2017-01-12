package com.testArrayTasks;

import arrayTasks.ArrayTasks;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Anna on 10.01.2017.
 */
public class TestArrayTasks {

  ArrayTasks arrayTasks;

  @Before
  public void setUp() {
    arrayTasks = new ArrayTasks();
  }

  @Test
  public void testMerge() {
    Object[] firstArray = {1, 3, 5};
    Object[] secondArray = {2, 4, 8, 9, 12};
    Object[] res = {1, 2, 3, 4, 5, 8, 9, 12};

    Object[] result = arrayTasks.merge(firstArray, secondArray);

    // assertThat(result, is(equalTo(res)));

    Arrays.sort(res);
    Arrays.sort(result);
    assertArrayEquals(res, result);

  }

  @Test
  public void testWithTwoNumbers() {
    int[] array = {1, 5, 7, 9, 12};
    int sum = 12;

    //  assertThat(arrayTasks.sumExists(array,sum), is(true));

    assertTrue("true in case of", arrayTasks.sumExists(array, sum));

  }

  @Test
  public void testWithOutTwoNumbers() {
    int[] array = {1, 5, 7, 9, 12};
    int sum = 3;

    assertFalse("false in case of", arrayTasks.sumNotExists(array, sum));

    //assertThat(arrayTasks.sumExists(array, sum), is(false));


  }

}