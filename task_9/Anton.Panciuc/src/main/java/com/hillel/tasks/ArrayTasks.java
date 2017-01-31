package com.hillel.tasks;

public class ArrayTasks {

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
    int last = array.length - 1;

    for (int i = 0; i < array.length - 1; ) {
      if (i > last) {
        return false;
      }
      if (array[i] + array[last] == sum) {
        return true;
      }
      if (array[i] + array[last] < sum) {
        i++;
      } else {
        last--;
      }
    }
    return false;
  }
}
