package com.hillel.tasks;


public class ArrayTasks {
  public int[] merge(int[] firstArray, int[] secondArray) {
    int mergeArrayLength = firstArray.length + secondArray.length;
    int[] result = new int[mergeArrayLength];

    int firstIndex = 0;
    int secondIndex = 0;

    for (int i = 0; i < mergeArrayLength; i++) {


      if (firstIndex >= firstArray.length) {
        result[i] = secondArray[secondIndex];
        secondIndex++;
        continue;
      }
      if (secondIndex >= secondArray.length) {
        result[i] = firstArray[firstIndex];
        firstIndex++;
        continue;
      }
      if (firstArray[firstIndex] < secondArray[secondIndex]) {
        result[i] = firstArray[firstIndex];
        firstIndex++;
        continue;
      }
      if (firstArray[firstIndex] >= secondArray[secondIndex]) {
        result[i] = secondArray[secondIndex];
        secondIndex++;
        continue;
      }

    }
    return result;
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