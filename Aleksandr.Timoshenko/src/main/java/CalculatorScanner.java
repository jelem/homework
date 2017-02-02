import java.util.Scanner;

public class CalculatorScanner{



 public static void main(String[] args){
    int firstOperand = 0;
    int secondOperand = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the operation");
    String operation = sc.next();
    System.out.println("Enter the first operand");
    firstOperand = sc.nextInt();
    System.out.println("Enter the operation");
    secondOperand = sc.nextInt();
       

    int result = computing(firstOperand, secondOperand, operation);
    System.out.printf("Result operation %s = %d", operation, result);




  }
  public static int computing(int firstOperand, int secondOperand, String operation){
    int result = 0;
    switch (operation){
      case "multiplication":
        result = firstOperand * secondOperand;
        break; 
      case "division":
        result = firstOperand / secondOperand;
        break;
      case "addition":
        result = firstOperand + secondOperand;
        break;
      case "subtraction":
        result = firstOperand - secondOperand;
        break;
      case "remainder of the division by zero":
        result = firstOperand % secondOperand;
        break;
      case "absolute value":
        result = Math.abs(firstOperand);
        break;
      default:
        System.out.println("This operation is not in the calculator");
	
      }
      return result;
  }
}