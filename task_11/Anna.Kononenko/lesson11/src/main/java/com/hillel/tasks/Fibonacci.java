package com.hillel.tasks;

/**
 * Created by ANN on 19.01.2017.
 */
  public class Fibonacci {

    public static void main(String[] args) {
      int result = fib(5);
      System.out.println(result);
    }

    public static int fib(int n) {
      if (n <= 2) {
        System.out.println("n=" + n);
        return 1;
      }
      System.out.println("n=" + n);
      return fib(n - 1) + fib(n - 2);

    }
  }


