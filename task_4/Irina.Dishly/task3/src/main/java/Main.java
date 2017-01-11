import java.util.Scanner;

public class Main {

public static void main (String[] args){

  String operation = args[0];
  int firstOperand = Integer.parseInt(args[1]);
  int secondOperand = Integer.parseInt(args[2]);


    double res = Calc.calculate(operation, firstOperand, secondOperand);
System.out.println("Result is: "+res);
}}
