import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input operation : ");
      String operation = scanner.next();
      System.out.println("Input first operand : ");
      double op1 = scanner.nextDouble();
      System.out.println("Input second operand : ");
      double op2 = scanner.nextDouble();
      double res = Task_2.calculate(operation, op1, op2);
      System.out.println("Result is : " + res);
    }
}
