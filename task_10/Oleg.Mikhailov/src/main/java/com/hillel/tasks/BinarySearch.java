package com.hillel.tasks;

public class BinarySearch {

  public boolean exists(int[] array, int number) {
    int low = 0;
    int high = array.length - 1;

    for (int i = 0; i < array.length; i++) {
      int middle = (high + low) / 2;
      if (array[middle] == number) {
        return true;
      }
      if (number <= array[middle]) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
    }

    return false;
  }
}
