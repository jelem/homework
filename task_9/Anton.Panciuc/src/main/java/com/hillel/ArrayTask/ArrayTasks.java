package com.hillel.ArrayTask;


import java.util.Arrays;

public class ArrayTasks {

  public int[] merge(int[] firstArray, int[] secondArray) {
    int[] resultArray = Arrays.copyOf(firstArray, secondArray.length + firstArray.length);
    int count = 0;

    for (int i = firstArray.length; i < resultArray.length; i++) {
      resultArray[i] = secondArray[count];
      count++;
    }
    Arrays.sort(resultArray);

    return resultArray;
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
