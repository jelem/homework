import java.util.Scanner;

public class Main {

public static void main (String[] args){
  Scanner scanner = new
Scanner(System.in);
  System.out.println("Enter operation - ");
    String operation = scanner.next();
  System.out.println("Enter first operand - ");
    int firstOperand = scanner.nextInt();
  System.out.println("Enter second operand - ");
    int secondOperand = scanner.nextInt();
    double res = Calc.calculate(operation, firstOperand, secondOperand);
System.out.println("Result is: "+res);
}}
