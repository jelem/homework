package com.hillel.tasks;

public class Fibonacci {

  public int iterative(int element) {
    int number = (int) Math
        .round((Math.pow((1 + Math.sqrt(5)) / 2, element) / Math.sqrt(5)) + 1 / 2);

    return number;
  }

  public int recursive(int element) {
    if (element == 1) {
      return 1;
    }
    if (element == 2) {
      return 1;
    }
    return recursive(element - 1) + recursive(element - 2);
  }

}

