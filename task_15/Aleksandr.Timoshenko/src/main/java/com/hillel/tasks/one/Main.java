package com.hillel.tasks.one;

public class Main {

  public static void main(String[] args) {

    Fibonacci fibonacci = new Fibonacci();

    int result = fibonacci.getElementAt(5);
    System.out.println("5th element: " + result);

    result = fibonacci.getElementAt(3);
    System.out.println("3th element: " + result);

    result = fibonacci.getElementAt(10);
    System.out.println("10 element: " + result);
  }
}
