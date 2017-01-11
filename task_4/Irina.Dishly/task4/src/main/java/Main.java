import java.util.Scanner;

public class Main {

public static void main (String[] args){
  Scanner scanner = new
Scanner(System.in);
  System.out.println("Enter level of service - ");
    String level = scanner.next();
  System.out.println("Enter price - ");
    int price = scanner.nextInt();

    double res = Tips.calculate(level, price);
System.out.println("Result is: "+res);
}}
