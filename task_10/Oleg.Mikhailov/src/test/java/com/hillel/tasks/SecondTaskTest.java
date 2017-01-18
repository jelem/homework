package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SecondTaskTest {

  BinarySearch binarySearch;
  static int[] array = new int[]{1, 3, 6, 9, 12};


  @Before
  public void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void testSearch() {
    int num = 9;

    assertThat(binarySearch.exists(array, num), is(true));
  }

  @Test
  public void testIncorrectSearch() {
    int num = 10;
    assertThat(binarySearch.exists(array, num), is(false));
  }


}
