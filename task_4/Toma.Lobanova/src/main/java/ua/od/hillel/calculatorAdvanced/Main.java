package ua.od.hillel.calculatorAdvanced;
import java. util. Scanner;
import ua.od.hillel.calculator.Calculator;

public class Main {

    public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the name of the operation");
        String operation = scanner.next();
        System.out.println("Please, enter the first operand");
        int operand1 = scanner.nextInt();
        System.out.println("Please, enter the second operand");
        int operand2 = scanner.nextInt();
        Calculator.calculate(operand1, operand2, operation);
    }
}