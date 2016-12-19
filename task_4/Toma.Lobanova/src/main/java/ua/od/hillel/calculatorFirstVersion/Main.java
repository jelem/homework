package ua.od.hillel.calculatorFirstVersion;
import ua.od.hillel.calculator.Calculator;

public class Main {

    public static void main(String... args) {
        int operand1 = 1;
        int operand2 = 2;
		String operation = "addition";
        Calculator.calculate(operand1, operand2, operation);
		operand1 = 5;
        operand2 = 25;
		operation = "division";
        Calculator.calculate(operand1, operand2, operation);
		operand1 = 45;
        operand2 = 2;
		operation = "remainder";
        Calculator.calculate(operand1, operand2, operation);
		operand1 = -11;
		operation = "absolute";
        Calculator.calculate(operand1, operand2, operation);
        operand1 = 67;
        operand2 = 7;
		operation = "subtraction";
        Calculator.calculate(operand1, operand2, operation);
		operand1 = 81;
        operand2 = 2;
		operation = "multiplication";
        Calculator.calculate(operand1, operand2, operation);
    }
}