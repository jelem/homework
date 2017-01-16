package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {
  BinarySearch binarySearch;

  @Before
  public void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void binarySearchTestPositive() {
    int[] array = {1, 45, 67, 89, 456, 789, 1000};
    boolean result = true;
    boolean actualResult = binarySearch.exists(array, 89);
    assertThat(actualResult, is(result));
    actualResult = binarySearch.exists(array, 789);
    assertThat(actualResult, is(result));
  }

  @Test
  public void binarySearchTestNegative() {
    int[] array = {1, 45, 67, 89, 456, 789, 1000};
    boolean result = false;
    boolean actualResult = binarySearch.exists(array, 90);
    assertThat(actualResult, is(result));
  }
}
