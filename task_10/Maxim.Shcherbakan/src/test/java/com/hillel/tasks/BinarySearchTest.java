package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

  BinarySearch binarySearch;

  @Before
  public void setUp() {
    this.binarySearch = new BinarySearch();
  }

  @Test
  public void testFoundReturnTrue() {
    int[] array = new int[]{1, 4, 5, 8, 12, 23, 29, 36, 42, 51, 63, 81};
    boolean result = binarySearch.exists(array, 63);
    assertThat(true, is(result));
  }

  @Test
  public void testNotFoundReturnFalse() {
    int[] array = new int[]{1, 4, 5, 8, 12, 23, 29, 36, 42, 51, 63, 81};
    boolean result = binarySearch.exists(array, 2);
    assertThat(false, is(result));
  }

  @Test
  public void testIfElementMoreThanArrayLength() {
    int[] array = new int[]{1, 4, 5, 8, 12, 23, 29, 36, 42, 51, 63, 81};
    boolean result = binarySearch.exists(array, 1500);
    assertThat(false, is(result));
  }
}
