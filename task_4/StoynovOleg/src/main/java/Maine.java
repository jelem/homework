package maine.java;

public class Maine {
  public static void main(String... args) {
    String operation = "addition";
    int pak1 = 10;
    int pak2 = 5;

    int result = Calc.calculate(pak1, pak2, "subtraction");
    int addition = Calc.calculate(pak1, pak2, "addition");
    int division = Calc.calculate(pak1, pak2, "division");
    int multiplication = Calc.calculate(pak1, pak2, "multiplication");
    int del = Calc.calculate(pak1, pak2, operation);

    System.out.println("The result is: " + result);
    System.out.println("The result is: " + addition);
    System.out.println("The result is: " + division);
    System.out.println("The result is: " + multiplication);
    System.out.println("The result is: " + del);
  }
}
