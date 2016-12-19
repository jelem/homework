package com.hillel.task1;
public class Main{
	
    public static void main(String[] args) {
    int addition = Calculator.calculator(15, 12, "addition");
	int subtraction = Calculator.calculator(15, 12, "subtraction");
	int division = Calculator.calculator(15, 12, "division");
	int multiplication = Calculator.calculator(15, 12, "multiplication");
	int modulo = Calculator.calculator(15, 12, "modulo");
	int mod = Calculator.calculator(15, 12, "mod");
	System.out.println("The result is " + addition );
	System.out.println("The result is " + subtraction );
	System.out.println("The result is " + division );
	System.out.println("The result is " + multiplication );
	System.out.println("The result is " + modulo );
	System.out.println("The result is " + mod );
	
	}
}