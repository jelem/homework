package com.hillel.task4;
import java.util.Scanner;
public class Main{
	
	
    public static void main(String[] args) {
	int sum = Integer.parseInt(args[0]);
	String service = args[1];
	System.out.println("Your result is : " + CountTips.countTips(sum, service));
	}
}

	  