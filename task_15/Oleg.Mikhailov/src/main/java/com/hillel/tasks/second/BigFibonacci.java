package com.hillel.tasks.second;

import java.math.BigInteger;

public class BigFibonacci {

  public static void main(String[] args) {
    System.out.println(searchNumFibonacci(BigInteger.TEN));
  }

  public static BigInteger searchNumFibonacci(BigInteger numIndex) {
    BigInteger first = BigInteger.ONE;
    BigInteger second = BigInteger.ONE;
    BigInteger sum;
    BigInteger index = BigInteger.ONE;

    while (!index.equals(numIndex)) {
      sum = first.add(second);
      first = second;
      second = sum;

      index = index.add(BigInteger.valueOf(1));
    }

    return first;
  }
}
