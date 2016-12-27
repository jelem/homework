package com.hillel.Task8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array8 {

  public static void main(String[] args){

    int n = 10;
    int[] array2 = initArray(n);
    int sumMinMax = SumMinMaxElementsArray(array2);
    System.out.println("Sum of Min and Max Elements Array = " + sumMinMax);


    int[] array3 = IntStream
          .rangeClosed(1, n)
          .toArray();

    int min = Arrays.stream(array3)
          .min()
          .getAsInt();
    int max = Arrays.stream(array3)
          .max()
          .getAsInt();

    System.out.println("Sum of Min and Max Elements Array = " + (min+max));

  }

  public static int SumMinMaxElementsArray(int[] array) {
    int min = array[0];
    int max = array[0];
    int sum = 0;
    for (int i = 1; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
      if (max < array[i]) {
        max = array[i];
      }
    }
    return sum = min + max;
   }
   public static int[] initArray(int n){
     int[] array2 = new int[n];
     int num = 1;
     for (int i = 0; i < n; i++) {
       array2[i] = num;
       num++;
     }
     return array2;
   }
}