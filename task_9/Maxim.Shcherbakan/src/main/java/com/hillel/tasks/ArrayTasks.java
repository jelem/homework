package com.hillel.tasks;

public class ArrayTasks {

  public int[] merge(int[] firstArray, int[] secondArray) {
    int lengthFirst = firstArray.length;
    int lengthSecond = secondArray.length;
    int lengthAmount = lengthFirst + lengthSecond;
    int[] array = new int[lengthAmount];
    int indexFirst = 0;
    int indexSecond = 0;
    for (int i = 0; i < lengthAmount; i++) {
      if (indexFirst == lengthFirst) {
        array[i] = secondArray[indexSecond];
        indexSecond++;
        continue;
      }
      if (indexSecond == lengthSecond) {
        array[i] = firstArray[indexFirst];
        indexFirst++;
        continue;
      }
      if (firstArray[indexFirst] < secondArray[indexSecond]) {
        array[i] = firstArray[indexFirst];
        indexFirst++;
      } else {
        array[i] = secondArray[indexSecond];
        indexSecond++;
      }
    }
    return array;
  }

  public boolean sumExists(int[] array, int sum) {
    for (int i : array) {
      for (int y : array) {
        if (i + y == sum) {
          return true;
        }
      }
    }
    return false;
  }
}
