package com.hillel.task4;
public class CountTips{
	
	
	public static int countTips(int op1, String service){
		
		
		double result;
		switch(service){
			case "terrible":
			 result = 0;
			 break; 
			case "poor":
			 result = op1*0.05;
			 break; 
			case "good":
			 result = op1*0.1;
			 break; 
			case "great":
			 result = op1*0.15;
			case "excellent":
			 result = op1*0.20; 
			 break; 	
			 default: 
			 throw new IllegalArgumentException("You should write correct operation");
		}
		return (int)result;
	}
}