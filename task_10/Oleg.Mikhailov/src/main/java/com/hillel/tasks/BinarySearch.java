package com.hillel.tasks;

public class BinarySearch {

  public boolean exists(int[] array, int number) {
    int low = 0;
    int height = array.length - 1;

    for (int i = 0; i < array.length; i++) {
      int middle = low + (height - low) / 2;
      if (array[middle] == number) {
        return true;
      }
      if (number <= array[middle]) {
        height = middle - 1;
      }
      if (number >= array[middle]) {
        low = middle + 1;
      }
    }

    return false;
  }
}
