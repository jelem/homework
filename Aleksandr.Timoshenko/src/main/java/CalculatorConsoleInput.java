
public class CalculatorConsoleInput{



 public static void main(String[] args){
    int firstOperand = Integer.parseInt(args[0]);
    int secondOperand = Integer.parseInt(args[1]);
    String operation = args[2];
    
    

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