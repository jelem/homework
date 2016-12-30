package com.hillel.task7;

public class Counter{

  public static int count(int num){
    
    int sum = 0;
    int d = 100000;

    while (d!=1){
      sum += num/d;
      num = num%d;
      d = d/10;     
    } 
    sum += num;
    if(sum>=10){
      sum = (sum/10)+(sum%10);
      return sum;
    }else{    
      return sum;
    }

  }
}