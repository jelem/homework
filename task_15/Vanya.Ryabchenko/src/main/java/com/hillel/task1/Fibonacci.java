package com.hillel.task1;

import java.util.Arrays;

public class Fibonacci {

  Integer[] cache = new Integer[100];


  public Integer fibonacciNumber(int index) {
    Integer sum = 0;
    Integer firstNumber = 1;
    Integer secondNumber = 1;

    if (cache[index - 1] != null) {
      return cache[index - 1];
    }

    cache[0] = firstNumber;
    cache[1] = secondNumber;

    if (index == 1) {
      return firstNumber;
    }
    if (index == 2) {
      return secondNumber;
    }

    for (int i = 2; i < index; i++) {
      sum = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = sum;
      cache[i] = sum;
    }
    System.out.println(Arrays.toString(cache));
    return sum;
  }

}
