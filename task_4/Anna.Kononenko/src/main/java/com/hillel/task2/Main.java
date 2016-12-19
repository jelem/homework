package com.hillel.task2;
import java.util.Scanner;
public class Main{
	
	
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
    System.out.println("Enter your number : ");
	int op1 = sc.nextInt();
    System.out.println("Enter your number: ");
	int op2 = sc.nextInt();
	System.out.println("Enter your operation: ");
	String operation = sc.next();
	System.out.println("Your result is : " + Calculator.calculator(op1, op2, operation));
	}
}