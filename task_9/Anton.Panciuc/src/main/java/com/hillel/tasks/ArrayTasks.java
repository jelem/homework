package com.hillel.tasks;


import java.util.Arrays;

public class ArrayTasks {

  public static void main(String[] args) {
    ArrayTasks arrayTasks = new ArrayTasks();
    int[] firstArray = {1, 5, 7};
    int[] secondArray = {4, 6, 9, 10, 17};
    boolean getResult = arrayTasks.sumExists(secondArray, 15);
  }

  public int[] merge(int[] firstArray, int[] secondArray) {
    int resultLength = firstArray.length + secondArray.length;
    int[] result = new int[resultLength];

    int firstIndex = 0;
    int secondIndex = 0;
    for (int i = 0; i < resultLength; i++) {

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
      } else {
        result[i] = secondArray[secondIndex];
        secondIndex++;
      }
    }
    return result;
  }

  public boolean sumExists(int[] array, int sum) {
    int j = array.length - 1;

    for (int i = 0; i < array.length-1; ) {
      if (i > j) {
        return false;
      }
      if (array[i] + array[j] == sum) {
        return true;
      }
      if (array[i] + array[j] < sum) {
        i++;
      } else {
        j--;
      }
    }
    return false;
  }
}
