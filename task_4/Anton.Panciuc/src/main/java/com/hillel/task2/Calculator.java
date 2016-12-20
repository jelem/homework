package com.hillel.task2;

import java.lang.Object;

public class Calculator {

public static int calculator(int firstOperand, int secondOperand, String operation) {
  int result;

  switch(operation) {

    case "multiplication":
      result = firstOperand * secondOperand;
      break;
    case "division":
      result = firstOperand / secondOperand;
      break;
    case "addition":
      result = firstOperand + secondOperand;
      break;
    case "subtraction":
      result = firstOperand - secondOperand;
      break;
    case "module":
      result = firstOperand % secondOperand;
      break;
    case "mod":
      result = Math.abs(firstOperand);
      break;
    default:
      result = 0;
  }
  return result;
  }
}
