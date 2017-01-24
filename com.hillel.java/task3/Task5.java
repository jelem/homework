package com.hillel.java;

/**
 * 5.  5. Даны 3 числа "a", "b" и "c". Найти максимальное из них.
 */

public class Task5 {
  public static void main(String[] args) {

    int a = 1;
    int b = 2;
    int c = 3;

    if (a > b && a > c) {
      System.out.println("max =" + a);
    } else
      if (b > a && b > c){
        System.out.println("max =" + b);
    } else
       if (c > a && c > b){
        System.out.println("max =" + c);

    }
  }
}