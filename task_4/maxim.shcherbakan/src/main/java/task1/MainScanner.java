package task1;
import java.util.Scanner;

public class MainScanner{

  public static void main(String[] args) {
    int op1 = 0;
    int op2 = 0;
    String operation = "";
    Scanner sc = new Scanner(System.in);

    //First operand
    System.out.print("Введите первое целое число: ");
    if(!sc.hasNextInt()){
      System.out.print("Вы ввели не целое число!");
    }else{
      op1 = sc.nextInt();
    }

    //Second operand
    System.out.print("Введите второе целое число: ");
    if(!sc.hasNextInt()){
      System.out.print("Вы ввели не целое число!");
    }else{
      op2 = sc.nextInt();
    }

    //Third operator
    System.out.print("Введите операцию(sum, multiplication, division, subtraction, remainder, module): ");
    operation = sc.next();

    if(op1 != 0 && op2 != 0){
      Calculator.calc(op1, op2, operation);
    }else{
      System.out.print("Вы не заполнили все аргументы, программа не будет работать!\n");
    }
  }
}
