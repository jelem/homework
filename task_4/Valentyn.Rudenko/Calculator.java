public class Calculator {

public static void main(String[] args) {

  String operation = "substraction";
     int firstOperand = 15;
     int secondOperand = 12;
     int result;
   switch (operation) {
    case "addition":
      result = firstOperand + secondOperand;
      break;
    case "substraction": //vichitanie
      result = firstOperand - secondOperand;
      break;
    case "division": //delenie
      result = firstOperand / secondOperand;
      break;
    case "multiplication":
    result = firstOperand * secondOperand;
    break;
    case "balance":
    result = firstOperand % secondOperand;
    break;
    default:
      result = 0;

   }
   System.out.println("The results is: " + result);
   System.out.println("Modul of number: " + Math.abs(result));
   }
 }
