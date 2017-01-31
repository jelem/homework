package com.hillel.tasks;


public class Fibonacci {
  // решение с рекурсией, сложность О(2^n)-
  public int recursive(int element) {
    if (element == 1) {
      return 1;
    }
    if (element == 2) {
      return 1;
    }
    return recursive(element - 1) + recursive(element - 2);
  }


  //решение интеративом , сложность O(n)-
  public int interative(int element) {
    int previous = 0;
    int next = 1;
    int summing = 1;
    for (int i = 1; i < element; i++) {
      summing = previous + next;
      previous = next;
      next = summing;
    }
    return summing;
  }
}