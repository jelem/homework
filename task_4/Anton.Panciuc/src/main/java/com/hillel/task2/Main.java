package com.hillel.task2;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Write an operation");
    String operation = sc.next();
    System.out.println("Write first operand");
    int op1 = sc.nextInt();
    System.out.println("Write second operand");
    int op2 = sc.nextInt();

    System.out.println("Result is " + Calculator.calculator(op1, op2, operation));

  }
}
