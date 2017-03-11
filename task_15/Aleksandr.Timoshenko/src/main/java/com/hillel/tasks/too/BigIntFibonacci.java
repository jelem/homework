package com.hillel.tasks.too;


import java.math.BigInteger;

public class BigIntFibonacci {

  public static void main(String[] args) {
    System.out.println(getBigIntegerElementAt(BigInteger.TEN));
  }

  public static BigInteger getBigIntegerElementAt(BigInteger position) {
    position = position.subtract(BigInteger.ONE);

    BigInteger first = BigInteger.ONE;
    BigInteger second = BigInteger.ONE;

    for (BigInteger i = BigInteger.valueOf(2); i.compareTo(position) <= 0;
        i = i.add(BigInteger.ONE)) {

      BigInteger current = first.add(second);
      first = second;
      second = current;
    }
    return second;
  }

}
