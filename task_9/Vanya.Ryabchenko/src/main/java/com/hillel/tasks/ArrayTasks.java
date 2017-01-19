package com.hillel.tasks;

public class ArrayTasks {

  public int[] merge(int[] firstArray, int[] secondArray) {
    int arrayLength = firstArray.length + secondArray.length;
    int[] array = new int[arrayLength];
    int firstIndex = 0;
    int secondIndex = 0;

    for (int i = 0; i < arrayLength; i++) {
      if (firstIndex >= firstArray.length) {
        array[i] = secondArray[secondIndex];
        secondIndex++;
        continue;
      }

      if (secondIndex >= secondArray.length) {
        array[i] = firstArray[firstIndex];
        firstIndex++;
        continue;
      }

      if (firstArray[firstIndex] < secondArray[secondIndex]) {
        array[i] = firstArray[firstIndex];
        firstIndex++;
      } else {
        array[i] = secondArray[secondIndex];
        secondIndex++;
      }
    }

    return array;
  }

  public boolean sumExists(int[] array, int sum) {
    int firstIndex = 0;
    int secondIndex = array.length - 1;
    int sumOfElement;
    boolean result = false;
    for (int i = 0; i < array.length; i++) {
      sumOfElement = array[firstIndex] + array[secondIndex];
      if (secondIndex == firstIndex) {
        break;
      }

      if (secondIndex < firstIndex) {
        break;
      }

      if (sumOfElement > sum) {
        secondIndex--;
      } else {
        if (sumOfElement < sum) {
          firstIndex++;
        } else {
          result = true;
        }
      }
    }
    return result;
  }
}
