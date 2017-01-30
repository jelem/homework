package com.hillel.tasks;

import java.util.Arrays;

public class ArrayTasks {

  public static void main(String[] args) {
    int[] firstArray = {1, 3, 5};
    int[] secondArray = {2, 4, 8, 9, 12};
    ArrayTasks task1 = new ArrayTasks();
    int[] array = task1.merge(firstArray, secondArray);
    System.out.println(Arrays.toString(array));

    int[] array1 = {1, 5, 7, 9, 12};
    int sum = 12;
    ArrayTasks task3 = new ArrayTasks();
    boolean result = task3.sumExists(array1, sum);
    System.out.println(result);
  }


  public int[] merge(int[] firstArray, int[] secondArray) {

    int[] array = new int[firstArray.length + secondArray.length];
    int firstIndex = 0;
    int secondIndex = 0;

    for (int i = 0; i < array.length; i++) {
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

      if (firstArray[firstIndex] <= secondArray[secondIndex]) {
        array[i] = firstArray[firstIndex];
        firstIndex++;
      } else {
        array[i] = secondArray[secondIndex];
        secondIndex++;
      }

    }
    return array;
  }


  public boolean sumExists(int[] array1, int sum) {
    int firstIndex = 0;
    int secondIndex = array1.length - 1;
    boolean result = false;
    while (firstIndex != secondIndex) {

      if (array1[firstIndex] + array1[secondIndex] == sum) {
        result = true;
      }
      if (array1[firstIndex] + array1[secondIndex] < sum) {
        firstIndex++;
      } else {
        secondIndex--;
      }

    }
    return result;
  }

}
