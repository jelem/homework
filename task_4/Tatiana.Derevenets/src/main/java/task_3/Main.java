package task_3;

public class Main {
  public static void main(String[] args) {

    int op1 = Integer.parseInt(args[0]);
    int op2 = Integer.parseInt(args[1]);
    String operation = (args[2]);

    int result = Calculator.calculate(op1, op2, operation);
    System.out.println("The result is: " + result);
  }
}
