package com.hillel.task2;


import java.math.BigInteger;

public class FibonachiBigInteger {

  static int number = 20;
  BigInteger[] array = new BigInteger[number];
  int index = 2;

  public static void main(String[] args) {

    FibonachiBigInteger fibonachiBigInteger = new FibonachiBigInteger();
    System.out.println(fibonachiBigInteger.calculation(number));

  }

  public BigInteger calculation(int number) {
    array[0] = BigInteger.ONE;
    array[1] = BigInteger.ONE;

    for (int i = index; i < number; i++) {
      array[i] = array[i - 1].add(array[i - 2]);

    }

    return array[number - 1];
  }


}
