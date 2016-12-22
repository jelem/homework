package maine.java;

import java.util.Scanner;

public class HomeworcSecond{
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter firstOperand: ");
    int op1 = scanner.nextInt();
    System.out.print("enter secondOperand: ");
    int op2 = scanner.nextInt();
    System.out.print("enter operation: ");
    String operation = scanner.next();

    int del = HomeworcCalculator.calculat(op1, op2, operation);
    System.out.print(del);
  }
}
