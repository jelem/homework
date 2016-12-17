package com.hillel;
public class Task_1 {
  public static void main(String args[])  {
    String operation = "subtraction";
    int firstOperand = 23;
    int secondOperand = 12;
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
