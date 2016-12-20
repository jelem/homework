package ua.od.hillel.calculator;

public class Main {

    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("You need to input two operands and the name of the operation for the calculator");
            return;
        }
        int operand1 = Integer.parseInt(args[0]);
        int operand2 = Integer.parseInt(args[1]);
        Calculator.calculate(operand1, operand2, args[2]);
    }
}