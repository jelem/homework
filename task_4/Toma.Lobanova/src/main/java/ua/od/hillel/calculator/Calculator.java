package ua.od.hillel.calculator;

public class Calculator {

    public static void calculate(int firstOperand, int secondOperand, String operation) {
		double result;
        switch (operation) {
            case "addition":
                result = firstOperand + secondOperand;
                break;
            case "subtraction":
                result = firstOperand - secondOperand;
                break;
            case "multiplication":
                result = firstOperand * secondOperand;
                break;
            case "division": {
                if (secondOperand != 0) {
                    result = (double) firstOperand / secondOperand;
                } else {
                    throw new ArithmeticException("You can't divide by zero");
                }
                break;
            }
            case "absolute":
                result = Math.abs(firstOperand);
                break;
            case "remainder":
                result = (double) firstOperand % secondOperand;
                break;
            default:
                throw new IllegalArgumentException("There is no such service rating");
        }
        System.out.print("The first operand = " + firstOperand);
        if (!operation.equals("absolute")) {
            System.out.print(" , the second operand = " + secondOperand);
        }
        System.out.println(" , the operation \"" + operation + "\" , the result = " + result);
    }

}