package com.hillel.task1;

import java.util.Arrays;

public class FiveElements{
  public static void main(String[] args) {
    int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
    Arrays.stream(array)
          .limit(5)
          .forEach(System.out::println);
  }
}
