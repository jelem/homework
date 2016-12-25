package maine.java;

public class HomeworcMain {
  public static void main(String... args) {
    String operation = "addition";
    int op1 = 15; //firstOperand
    int op2 = 12; //secondOperand
    int result = HomeworcCalculator.calculat(op1, op2, operation);
    int del = HomeworcCalculator.calculat(op1, op2, operation);

    System.out.println("The result is" + result);

  }
}
