public class Task_3{
public static double  calculate(String operation, double firstOperand,double secondOperand) {
  double result;
    switch(operation) {
      case "addition":
        result = firstOperand + secondOperand;
      break;

      case "subtraction":
        result = firstOperand - secondOperand;
      break;

      case "multiplication":
        result = firstOperand * secondOperand;
      break;

      case "division":
        result = firstOperand / secondOperand;
      break;

      case "modul":
        result = Math.abs(firstOperand);
      break;

      case "reminderOfDivision":
        result = firstOperand % secondOperand;
      break;
      default:
      result = 0;
    }
    return result;
  }
}
