package com.hillel.tasks;

public class Fibonacci {
  public int iterative(int element) {

    if (element == 1 || element == 2) {
      return 1;
    }

    double result = (Math.pow(((1 + Math.sqrt(5)) / 2), element) / Math.sqrt(5));
    return (int) Math.round(result);
  }

  public int recursive(int element) {

    if (element == 1 || element == 2) {
      return 1;

    } else {
      return recursive(element - 1) + recursive(element - 2);
    }
  }
}
