package com.hillel.tasks;

public class BinarySearch {

  public boolean exists(int[] array, int number) {
    if (array[0] > number) {
      return false;
    }
    if (array[array.length - 1] < number) {
      return false;
    }
    if (array.length == 0) {
      return false;
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        return true;
      }

    }
    return false;
  }
}
