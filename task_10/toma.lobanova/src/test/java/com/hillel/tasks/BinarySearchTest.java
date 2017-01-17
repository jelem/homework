package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {
  BinarySearch binarySearch;
  int[] array = {1, 45, 67, 89, 456, 789, 1000};

  @Before
  public void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void binarySearchTestPositive() {
    boolean actualResult = binarySearch.exists(array, 89);
    assertThat(actualResult, is(true));
    actualResult = binarySearch.exists(array, 789);
    assertThat(actualResult, is(true));
  }

  @Test
  public void binarySearchTestNegative() {
    boolean actualResult = binarySearch.exists(array, 90);
    assertThat(actualResult, is(false));
  }
}

