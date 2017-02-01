package com.hillel.fibonacci.biginteger;

import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonacci {
  ArrayList<BigInteger> cache;

  public Fibonacci() {
    cache = new ArrayList<BigInteger>();
    cache.add(BigInteger.ONE);
    cache.add(BigInteger.ONE);
  }

  public BigInteger findNumber(int index) {
    if (index < 1) {
      throw new IllegalArgumentException();
    }
    if (index <= cache.size()) {
      return cache.get(index - 1);
    }
    BigInteger number = BigInteger.ZERO;
    for (int i = cache.size(); i < index; i++) {
      number = cache.get(i - 1).add(cache.get(i - 2));
      cache.add(number);
    }
    return number;
  }

  public boolean isNumberInCache(int index) {
    return (index <= cache.size() && index >= 1);
  }
}
