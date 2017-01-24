package com.hillel.tasks;

public class Fibonacci {

  public int iterative(int element) {
    if (element <= 0) {
      return 0;
    }
    if (element == 1 || element == 2) {
      return 1;
    }
    int currentElement = 2;
    int firstElement = 1;
    int position = 3;
    while (element > position) {
      int temp = currentElement;
      currentElement = temp + firstElement;
      firstElement = temp;
      position++;
    }
    return currentElement;
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


