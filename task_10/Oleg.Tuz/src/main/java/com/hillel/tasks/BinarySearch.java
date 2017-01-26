package com.hillel.tasks;

public class BinarySearch {
  public boolean exists(int[] array, int number) {

    int first = 0;
    int last = array.length - 1;
    int middle = (first + last) / 2;

    for (int i = 0; i < array.length; i++) {
      if (array[middle] == number) {
        return true;
      }
      if (number <= array[middle]) {
        last = middle - 1;
      } else {
        first = middle + 1;
      }
      middle = (first + last) / 2;
    }

    return false;
  }

}
