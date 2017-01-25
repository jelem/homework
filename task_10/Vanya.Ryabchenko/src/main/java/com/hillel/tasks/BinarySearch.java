package com.hillel.tasks;

public class BinarySearch {

  public boolean exists(int[] array, int number) {
    int firstIndex = 0;
    int lastIndex = array.length - 1;
    while (firstIndex != lastIndex) {
      int middleIndex = (firstIndex + lastIndex) >>> 1;
      if (array[middleIndex] == number) {
        return true;
      }
      if (array[middleIndex] <= number) {
        firstIndex = middleIndex + 1;
      } else {
        lastIndex = middleIndex - 1;
      }
      if (lastIndex < firstIndex) {
        return false;
      }
    }
    return false;
  }
}
