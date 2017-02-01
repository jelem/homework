package com.hillel.fibonacci.integer;

import java.util.ArrayList;

public class Fibonacci {
  ArrayList<Integer> cache;

  public Fibonacci() {
    cache = new ArrayList<Integer>();
    cache.add(1);
    cache.add(1);
  }

  public int findNumber(int index) {
    if (index < 1) {
      throw new IllegalArgumentException();
    }
    if (index <= cache.size()) {
      return cache.get(index - 1);
    }
    int number = 0;
    for (int i = cache.size(); i < index; i++) {
      number = cache.get(i - 1) + cache.get(i - 2);
      cache.add(number);
    }
    return number;
  }

  public boolean isNumberInCache(int index) {
    return (index <= cache.size() && index >= 1);
  }
}
