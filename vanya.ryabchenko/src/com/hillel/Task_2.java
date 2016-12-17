package com.hillel;
import java.util.Scanner;

public class Task_2 {
  public static void main(String args[])  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input operation :");
    String operation = scanner.next();
    System.out.println("Input firstOperand :");
    double firstOperand = scanner.nextInt();
    System.out.println("Input secondOperand :");
    double secondOperand = scanner.nextInt();
    double result=0;

    switch(operation) {
      case "addition":
        result = firstOperand + secondOperand;
      break;

      case "subtraction":
        result = firstOperand - secondOperand;
      break;

      case "multiplication":
        result = firstOperand * secondOperand;
      break;

      case "division":
        result = firstOperand / secondOperand;
      break;

      case "modul":
        result = Math.abs(firstOperand);
      break;

      case "reminderOfDivision":
        result = firstOperand % secondOperand;
      break;

    }
System.out.println("Result is " + result);
  }
}
