package com.hillel.tasks.task1;

public class Cache {
  public static void main(String[] args) {
    FibonacciNCache fibonacciNCache = new FibonacciNCache();

    int result = fibonacciNCache.getElementAt(10);
    System.out.println("10th element:" + result);

    result = fibonacciNCache.getElementAt(5);
    System.out.println("5th element:" + result);

    result = fibonacciNCache.getElementAt(12);
    System.out.println("12th element:" + result);
  }
}
