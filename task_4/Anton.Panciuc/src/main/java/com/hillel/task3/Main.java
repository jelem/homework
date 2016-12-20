package com.hillel.task3;

public class Main {

  public static void main(String[] args) {

    int op1 = Integer.parseInt(args[0]);
    int op2 = Integer.parseInt(args[1]);
    String operation = args[2];

    System.out.println("Result is " + Calculator.calculator(op1, op2, operation));

  }
}
