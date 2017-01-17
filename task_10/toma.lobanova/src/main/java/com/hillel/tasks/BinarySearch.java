package com.hillel.tasks;

public class BinarySearch {

  public boolean exists(int[] array, int number) {
    return exists(array, number, 0, array.length - 1);
  }

  private boolean exists(int[] array, int number, int startIndex, int endIndex) {
    if (endIndex < startIndex) {
      return false;
    }
    int midIndex = (startIndex + endIndex) >>> 1;
    if (number < array[midIndex]) {
      return exists(array, number, startIndex, midIndex - 1);
    } else if (number > array[midIndex]) {
      return exists(array, number, midIndex + 1, endIndex);
    } else {
      return true;
    }
  }
}

