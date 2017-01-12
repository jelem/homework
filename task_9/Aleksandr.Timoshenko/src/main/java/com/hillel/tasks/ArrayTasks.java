package com.hillel.tasks;

import java.util.Arrays;

public class ArrayTasks {

  public int[] merge(int[] firstArray, int[] secondArray) {
    int [] array = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);

    for (int i = firstArray.length, j = 0; i < array.length; i++, j++){
      array [i] = secondArray [j];
    }
    Arrays.sort(array);
    return array;
  }

  public boolean sumExists(int[] array, int sum) {
    boolean result = false;
    for (int i = 0; i < array.length; i++){
      for (int j = 1; j < array.length; j++){
        if(array[i]+array[j] == sum){
          result = true;
        }
      }
    }
    return result;
  }
}