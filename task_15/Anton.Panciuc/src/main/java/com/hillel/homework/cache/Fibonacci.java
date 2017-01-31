package com.hillel.homework.cache;


import java.util.Arrays;
import java.util.stream.Stream;

public class Fibonacci {
  private int[] cache = new int[15];


  public int recursive(int element) {
    if (cache[element - 1] != 0) {
      return cache[element - 1];
    }

    if (element == 1 || element == 2) {
      cache[0] = 1;
      cache[1] = 1;
      return 1;

    } else {
      int result = recursive(element - 1) + recursive(element - 2);
      cache[element - 1] = result;
      return result;
    }
  }

  public int getCacheElement(int element) {
    return cache[element - 1];
  }

  public String getCache(int element) {
    String cacheCurrentRange = new String();
    for (int i = 0; i < element; i++) {
      cacheCurrentRange += cache[i] + " ";
    }
    return cacheCurrentRange;
  }
}
