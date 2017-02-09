package com.hillel.task2;


import java.math.BigInteger;

public class Fibonacci {

  @CheckReturnValue
  public BigInteger fibonacciNumber(int index) {
    BigInteger firstNumber = BigInteger.ONE;
    BigInteger secondNumber = BigInteger.ONE;
    BigInteger sum = null;
    if (index == 1) {
      return firstNumber;
    }

    if (index == 2) {
      return secondNumber;
    }
    for (int i = 2; i < index; i++) {
      sum = firstNumber.add(secondNumber);
      firstNumber = secondNumber;
      secondNumber = sum;
    }
    return sum;
  }

}
