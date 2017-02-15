package com.hillel.tasks.task1;

public class Cache {
  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();

    int result = fibonacci.getElementAt(10);
    System.out.println("10th element:" + result);

    result = fibonacci.getElementAt(5);
    System.out.println("5th element:" + result);

    result = fibonacci.getElementAt(12);
    System.out.println("12th element:" + result);
  }
}
