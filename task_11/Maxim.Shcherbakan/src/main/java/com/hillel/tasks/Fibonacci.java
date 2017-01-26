package com.hillel.tasks;

public class Fibonacci {

  public int iterative(int element) {
    int prev = 0;
    int next = 1;
    int tmp = 1;
    for (int i = 1; i < element; i++) {
      tmp = prev + next;
      prev = next;
      next = tmp;
    }
    return tmp;
  }

  public int recursive(int element) {
    if (element < 3) {
      return 1;
    }
    return recursive(element - 1) + recursive(element - 2);
  }
}
