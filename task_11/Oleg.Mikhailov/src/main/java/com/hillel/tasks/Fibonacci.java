package com.hillel.tasks;

public class Fibonacci {


  public int iterative(int element) {
    if (element == 0) {
      return 0;
    }
    if (element == 1) {
      return 1;
    }
    double sqrtFive = Math.sqrt(5);
    double firstDiv = Math.pow(((1 + sqrtFive) / 2), element);
    double result = (firstDiv / sqrtFive);
    return (int) result;
  }

  public int recursive(int element) {

    if (element == 0) {
      return 0;
    }
    if (element == 1) {
      return 1;
    } else {
      return recursive(element - 1) + recursive(element - 2);
    }
  }
}
