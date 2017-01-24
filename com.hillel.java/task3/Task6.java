package com.hillel.java;

/**
 6. Найти ближайшее к 10 из 2х заданных чисел "a" и "b".
 Например, среди чисел 8 и 11 ближайшее к десяти 11. */

public class Task6 {

  public static void main(String[] args) {

  int a = 10;
  int b = 11;
  int c = 8;

  int d =  Math.abs(a-b);
  int e = Math.abs(b-c);

  if (d < e){
    System.out.println("closest to ten " + a);
  } else {
    System.out.println("closest to ten " + c);
  }
  }
}





