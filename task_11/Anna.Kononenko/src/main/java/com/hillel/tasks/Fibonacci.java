package com.hillel.tasks;

public class Fibonacci {

  public static void main(String[] args) {
    int result = iterative(5);
    System.out.println(result);
  }

  public static int recursive(int element) {
    if (element <= 2) {
      System.out.println("element=" + element);
      return 1;
    }
    System.out.println("element=" + element);
    return recursive(element - 1) + recursive(element - 2);

  }


  public static int iterative(int element) {
    int firstNumber = 1;
    int secondNumber = 1;
    int current = 1;
    for (int i = 3; i <= element; i++) {
      current = firstNumber + secondNumber; //2
      firstNumber = secondNumber;
      secondNumber = current;
    }
    return secondNumber;
  }
}

