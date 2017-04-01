package com.hillel.tasks.task2;

import java.math.BigInteger;


public class FibonacciBigInteger {


  public BigInteger getBigIntegerElementAt(BigInteger position) {
    position = position.subtract(BigInteger.ONE);


    BigInteger previous = BigInteger.ONE;
    BigInteger next = BigInteger.ONE;

    for (BigInteger i = BigInteger.valueOf(2);
         i.compareTo(position) <= 0;
         i = i.add(BigInteger.ONE)) {

      BigInteger current = previous.add(next);
      previous = next;
      next = current;
    }

    return next;


  }



}
