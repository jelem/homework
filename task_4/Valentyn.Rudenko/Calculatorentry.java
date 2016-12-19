import java.util.Scanner;

public class Calculatorentry {


public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  System.out.println("Please input operation (addition,substraction,division,multiplication,balance) ");
  String operation = scanner.next();
  System.out.println("Please input firstOperand: ");
  int firstOperand = scanner.nextInt();
  System.out.println("Please input secondOperand: ");
  int secondOperand = scanner.nextInt();

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
   //System.out.println("Modul of number: " + Math.abs(result));
   }
 }
