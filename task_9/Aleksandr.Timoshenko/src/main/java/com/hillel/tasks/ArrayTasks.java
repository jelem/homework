package com.hillel.tasks;

import java.util.Arrays;

public class ArrayTasks {

  public int[] merge(int[] firstArray, int[] secondArray) {
    int[] array = new int[firstArray.length + secondArray.length];
    int elementFirstArray = 0;
    int elementSecondArray = 0;
    for (int i = 0; i < array.length; i++) {
      if (firstArray.length <= elementFirstArray) {
        array[i] = secondArray[elementSecondArray];
        elementSecondArray++;
        continue;
      }
      if (secondArray.length <= elementSecondArray) {
        array[i] = firstArray[elementFirstArray];
        elementFirstArray++;
        continue;
      }
      if (firstArray[elementFirstArray] < secondArray[elementSecondArray]) {
        array[i] = firstArray[elementFirstArray];
        elementFirstArray++;
      } else {
        array[i] = secondArray[elementSecondArray];
        elementSecondArray++;
      }
    }
    return array;
  }

  public boolean sumExists(int[] array, int sum) {
    boolean result = false;
    int lowIndex = 0;
    int hiIndex = array.length - 1;
    while (lowIndex != hiIndex) {
      if (array[lowIndex] + array[hiIndex] == sum) {
        result = true;
        break;
      }
      if (array[lowIndex] + array[hiIndex] > sum) {
        hiIndex--;
        continue;
      }
      if (array[lowIndex] + array[hiIndex] < sum) {
        lowIndex++;
        continue;
      }
    }
    return result;
  }
}