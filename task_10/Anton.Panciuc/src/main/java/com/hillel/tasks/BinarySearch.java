package com.hillel.tasks;

public class BinarySearch {

  public static boolean exists(int[] array, int value) {
    return exists(array, value, 0, array.length - 1);
  }

  private static boolean exists(int[] array, int value, int lower, int higher) {
    if (lower > higher) {
      return false;
    }

    int mid = lower + (higher - lower) / 2;

    if (value < array[mid]) {
      return exists(array, value, lower, mid - 1);
    } else if (value > array[mid]) {
      return exists(array, value, mid + 1, higher);
    } else {
      return true;
    }
  }
}
