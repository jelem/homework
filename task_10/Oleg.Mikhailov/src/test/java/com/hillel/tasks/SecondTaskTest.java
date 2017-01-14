package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SecondTaskTest {

  BinarySearch binarySearch;

  @Before
  public void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void testSearch() {
    int[] array = {1, 3, 6, 9, 12};
    int num = 9;

    assertThat(binarySearch.exists(array, num), is(true));
  }

  @Test
  public void testIncorrectSearch() {
    int[] array = {1, 3, 6, 9, 12};
    int num = 10;
    assertThat(binarySearch.exists(array, num), is(false));
  }


}
