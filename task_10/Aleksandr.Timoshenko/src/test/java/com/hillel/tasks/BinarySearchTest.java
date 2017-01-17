package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

  BinarySearch binarySearch;
  int[] array = {3, 4, 8, 19, 25};

  @Before
  public void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void existsTruTest() {
    int number = 8;
    assertThat(binarySearch.exists(array, number), is(true));
  }

  @Test
  public void existsFalseTest() {
    int number = 27;
    assertThat(binarySearch.exists(array, number), is(false));
  }

  @Test
  public void existsFalse2Test() {
    int number = 7;
    assertThat(binarySearch.exists(array, number), is(false));
  }
}
