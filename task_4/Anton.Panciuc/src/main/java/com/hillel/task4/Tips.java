package com.hillel.task4;

import java.util.Scanner;

public class Tips {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Write your bill");
    int billAmount = sc.nextInt();
    System.out.println("Write service level");
    String serviceLevel = sc.next();

    System.out.println("You should left " + calculateTips(billAmount, serviceLevel) + " grn tips");
  }

  public static double calculateTips(int amount, String level) {

    double result;

    switch (level) {

      case "terrible":
        result = 0;
        break;
      case "poor":
        result = amount * 0.05;
        break;
      case "good":
        result = amount * 0.1;
        break;
      case "great":
        result = amount * 0.15;
        break;
      case "excellent":
        result = amount * 0.2;
        break;
      default:
        result = 0;
    }
    return result;
  }
}
