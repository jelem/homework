package com.hillel.tasks;

public class Fibonacci {

  public int iterative(int element) {

    if (element == 0) {
      return 0;
    }

    if (element == 1 || element == 2) {
      return 1;
    }

    int number = (int) Math.round(Math.pow((1 + Math.sqrt(5)) / 2, element) / Math.sqrt(5) + 0 / 5);
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