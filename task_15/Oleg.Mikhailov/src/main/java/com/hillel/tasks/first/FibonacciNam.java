package com.hillel.tasks.first;

public class FibonacciNam {

  private static Integer[] cache = new Integer[500];

  public static int searchNumFibonacci(int numIndex) {
    cache[0] = 1;
    cache[1] = 1;

    if (cache[numIndex - 1] != null) {
      return cache[numIndex - 1];
    }

    int first = 1;
    int second = 1;
    int searchNum = 1;

    for (int i = 0; i < numIndex - 2; i++) {
      searchNum = first + second;
      if (i != 500) {
        cache[i + 2] = searchNum;
      }
      first = second;
      second = searchNum;
    }
    return searchNum;
  }
}

