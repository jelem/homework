package com.hillel.java;

/**
 * Created by ANN on 17.01.2017.
 */
import org.junit.Before;
import org.junit.Test;

import com.hillel.tasks.BinarySearch;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

  BinarySearch binarySearch;
  int[] array = {1, 3, 6, 9, 12};

  @Before
  public void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void testExistsPositive() {
    int number = 9;
    assertThat(binarySearch.exists(array, number), is(true));
  }

  @Test
  public void testExistsNegative() {
    int number = 7;
    assertThat(binarySearch.exists(array, number), is(false));
  }
}