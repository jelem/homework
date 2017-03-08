package com.hillel.tasks.one;

public class Fibonacci {

  int[] fibCache = new int[50];
  int lastIndex = 1;

  public Fibonacci() {
    fibCache[0] = 1;
    fibCache[1] = 1;
  }

  public int getElementAt(int position) {

    position--;
    if (fibCache[position] != 0) {
      return fibCache[position];
    }
    int first = fibCache[lastIndex - 1];
    int second = fibCache[lastIndex];

    for (int i = lastIndex + 1; i <= position; i++) {

      int current = first + second;
      first = second;
      second = current;

      fibCache[i] = current;
    }
    lastIndex = position;
    return second;
  }

}
