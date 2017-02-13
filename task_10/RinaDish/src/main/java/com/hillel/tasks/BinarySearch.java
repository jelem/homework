package com.hillel.tasks;

public class BinarySearch {

  public boolean exists(int[] array, int number) {
    int firstIndex = 0;
    int lastIndex = array.length - 1;
    while (firstIndex != lastIndex) {
      int midleIndex = (firstIndex + lastIndex) >>> 1;
      if (number == array[midleIndex]) {
        return true;
      }
      if (number <= array[midleIndex]) {
        lastIndex = midleIndex - 1;
      } else {
        firstIndex = midleIndex + 1;
      }
      if (lastIndex < firstIndex) {
        return false;
      }
    }

    return false;
  }

}
