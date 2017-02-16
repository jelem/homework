package com.hillel.tasks.task1;


public class FibonacciNCache {
  int[] fibonacciCache = new int[50];
  int lastIndex = 1;

  public FibonacciNCache() {
    fibonacciCache[0] = 1;
    fibonacciCache[1] = 1;
  }

  public int getElementAt(int position) {
    position--;

    if (fibonacciCache[position] != 0) {
      return fibonacciCache[position];
    }
    int previous = fibonacciCache[lastIndex-1];
    int next = fibonacciCache[lastIndex];

    for (int i = lastIndex +1 ; i <= position; i++) {
      int current = previous + next;
      previous = next;
      next = current;

      fibonacciCache[i] = current;
    }
    lastIndex = position;
    return next;
  }
}
