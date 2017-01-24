package com.hillel.tasks;

public class BinarySearch {
  public boolean exists(int[] array, int number) {
    int left = 0;
    int right = array.length;
    int center = (left + right) / 2;
    for (int i = 0; i < array.length; i++) {
      if (array[center] == number) {
        return true;
      }
      if (array[center] > number) {
        right = center - 1;
      } else {
        left = center + 1;
      }
      center = (left + right) / 2;
      if (center > array.length - 1) {
        return false;
      }
    }
    return false;
  }
}
