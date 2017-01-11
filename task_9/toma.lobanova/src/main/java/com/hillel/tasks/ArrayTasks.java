package com.hillel.tasks;

import java.util.Arrays;

public class ArrayTasks {
  public int[] merge(int[] firstArray, int[] secondArray) {
    int lengthFirst = firstArray.length;
    int lengthSecond = secondArray.length;
    int lengthThird = lengthFirst + lengthSecond;
    int[] newArray = new int[lengthThird];
    for (int i = 0; i < lengthFirst; i++) {
      newArray[i] = firstArray[i];
    }
    for (int i = lengthFirst; i < lengthThird; i++) {
      newArray[i] = secondArray[i - lengthFirst];
    }
    Arrays.sort(newArray);
    return newArray;
  }

  public boolean sumExists(int[] array, int sum) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == sum) {
          return true;
        }
      }
    }
    return false;
  }
}
