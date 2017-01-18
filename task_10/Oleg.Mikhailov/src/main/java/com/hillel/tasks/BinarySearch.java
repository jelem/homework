package com.hillel.tasks;

public class BinarySearch {

  public boolean exists(int[] array, int number) {
    int low = 0;
    int high = array.length - 1;
    int middle = (high + low) / 2;

    for (int i = 0; i < array.length; i++) {
      if (array[middle] == number) {
        return true;
      }
      if (number <= array[middle]) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
      middle = (high + low) / 2;
    }

    return false;
  }
}
