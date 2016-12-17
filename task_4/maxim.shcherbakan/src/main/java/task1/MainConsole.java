package task1;
import java.util.Scanner;

public class MainConsole{

  public static void main(String[] args) {
    int op1 = Integer.parseInt(args[0]);
    int op2 = Integer.parseInt(args[1]);

    if(op1 == 0){
      throw new IllegalArgumentException("Операнд 1 - введите целое число!");
    }

    if(op2 == 0){
      throw new IllegalArgumentException("Операнд 2 - введите целое число!");
    }

    Calculator.calc(op1, op2, args[2]);
  }
}
