package com.hillel;
import java.util.Scanner;
public class Task_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Level of service : \n *terrible \n *poor \n *good \n *great \n *excellent \n Input level of service :");
    String levelOfService = scanner.next();
    System.out.println("Input bill : ");
    double bill = scanner.nextDouble();
    double tip = 0;
    switch (levelOfService) {
      case "terrible":
        tip = bill*0/100;
      break;
      case "poor":
        tip = bill*5/100;
      break;
      case "good":
        tip = bill*10/100;
      break;
      case "great":
        tip = bill*15/100;
      break;
      case "excellent":
        tip = bill*20/100;
      break;
    }
    System.out.println("Tip is :" + tip);
  }
}
