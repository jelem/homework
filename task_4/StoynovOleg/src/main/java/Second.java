package maine.java;
import java.util.Scanner;

public class Second{
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter figur first: ");
    int op1 = scanner.nextInt();
    System.out.print("Enter second: ");
    int op2 = scanner.nextInt();
    System.out.print("Enter operation: ");
    String operation = scanner.next();

    int del = Calc.calculate(op1, op2, operation);
    System.out.print(del);
    
  }
}
