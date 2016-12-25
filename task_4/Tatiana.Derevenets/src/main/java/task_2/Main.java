package task_2;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int op1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    int op2 = sc.nextInt();
    System.out.println("Enter the operation: ");
    String operation  = sc.next();

    int result = Calculator.calculate(op1, op2, operation);
    System.out.println("The result is: " + result);
  }
}
