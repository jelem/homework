package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

 BinarySearch binarySearch;
 static int[] array = new int[]{1, 3, 5, 7, 8, 9, 10, 11, 12, 13};

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
  int num = 4;

  assertThat(binarySearch.exists(array, num), is(false));
 }
}
