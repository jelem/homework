package com.hillel.java.shortHomework;

import java.util.Arrays;

public class Task1 {

  public static void main(String[] args) {
    int[] firstArray = {1, 3, 5, 9, 12};
    int[] secondArray = {1, 2, 7, 12};

    int sum = 12;

    System.out.println(Arrays.toString(merge(firstArray, secondArray)));

    System.out.println(sum(firstArray, sum));
  }


  public static int[] merge(int[] firstArray, int[] secondArray) {
    int sizeArray = firstArray.length + secondArray.length;
    int[] result = new int[sizeArray];

    int firstIndex = 0;
    int secondIndex = 0;
    for (int i = 0; i < sizeArray; i++) {

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


  private static boolean sum(int[] firstArray, int sum) {
    int firstIndex = 0;
    int secondIndex = firstArray.length - 1;
    for (int i = 0; i < firstArray.length; i++) {

      if (firstArray[firstIndex] + firstArray[secondIndex] == sum) {
        return true;
      }

      if (firstArray[firstIndex] + firstArray[secondIndex] > sum) {
        secondIndex--;
      } else {
        firstIndex++;
      }
    }
    return false;


  }
}
