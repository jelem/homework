package com.hillel.tasks;

import java.util.Arrays;

public class ArrayTasks {


  public int[] merge(int[] firstArray, int[] secondArray) {
    int[] result = Arrays.copyOf(firstArray, secondArray.length + firstArray.length);
    int position = 0;

    for (int i = firstArray.length; i < result.length; i++) {
      result[i] = secondArray[position];
      position++;
    }
    Arrays.sort(result);

    return result;
  }

  public boolean sumExists(int[] array, int sum) {

    int position = 1;
    for (int i = 0; i < array.length; i++) {
      for (int j = position; j < array.length; j++) {
        if (array[i] + array[j] == sum) {
          return true;
        }
      }
      position++;
    }
    return false;
  }
}
