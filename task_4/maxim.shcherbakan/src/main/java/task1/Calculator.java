package task1;

public class Calculator{

  public static double calc(int op1, int op2, String operation){
    double result = 0;

    switch(operation)
    {
      case "sum":
        result = op1 + op2;
        break;

      case "multiplication":
        result = op1 * op2;
        break;

      case "division":
        result = op1 / op2;
        break;

      case "subtraction":
        result = op1 - op2;
        break;

      case "remainder":
        result = op1 % op2;
        break;

      case "module":
        result = Math.abs(op1);

      default:
        throw new IllegalArgumentException("Такой операции не существуте!");
    }

    System.out.println("Result: " + result);
    return result;
  }
}
