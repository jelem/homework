package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

  BinarySearch task5;

  @Before
  public void setUp() {
    task5 = new BinarySearch();
  }

  @Test
  public void existsTes() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int number = 3;
    assertThat(task5.exists(array, number), is(true));
  }


}
