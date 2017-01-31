package com.hillel.homework.biginteger;


import java.math.BigInteger;

public class Fibonacci {
  public BigInteger recursive(BigInteger element) {


    if (element.equals(BigInteger.valueOf(1))) {
      return BigInteger.valueOf(1);
    }

    if (element.equals(BigInteger.valueOf(2))) {
      return BigInteger.valueOf(1);
    }

    BigInteger result = recursive(element.add(BigInteger.valueOf(-1)))
        .add(recursive(element.add(BigInteger.valueOf(-2))));

    return result;
  }
}
