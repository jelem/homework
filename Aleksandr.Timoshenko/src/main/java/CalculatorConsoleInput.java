
public class CalculatorConsoleInput{



 public static void main(String[] args){
    int firstOperand = Integer.parseInt(args[0]);
    int secondOperand = Integer.parseInt(args[1]);
    String operation = args[2];
    
    

    int result = computing(firstOperand, secondOperand, operation);
    System.out.printf("Result operation %s = %d", operation, result);




  }
  public static int computing(int firstOperand, int secondOperand, String operation){
    int result;
    switch (operation){
      case "multiplication":
        return result = firstOperand * secondOperand; 
      case "division":
        return result = firstOperand / secondOperand;
      case "addition":
        return result = firstOperand + secondOperand;
      case "subtraction":
        return result = firstOperand - secondOperand;
      case "remainder of the division by zero":
        return result = firstOperand % secondOperand;
      case "absolute value":
        if(firstOperand != 0){
          return result = Math.abs(firstOperand);
        }else{
          return result = Math.abs(secondOperand);
	}
      default:
        System.out.println("This operation is not in the calculator");
	return result = 0;
      }
  }
}