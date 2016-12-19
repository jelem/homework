  import java.util.Scanner;
  public class Main {

  public static void main(String[] args) {
     int result1,result2;
     Scanner scn = new Scanner(System.in);
       System.out.println("Input first number");
     int first = scn.nextInt();
       System.out.println("Input second number");
     int second = scn.nextInt();
       System.out.println("Input function");
     String function = scn.next();
     result1 = Calculator.calculate(first, second, function); 
     result2 = Calculator.calculate(18, 9, "multiplication");
       System.out.println("The result is: " + result1 + " " + result2);
}
}