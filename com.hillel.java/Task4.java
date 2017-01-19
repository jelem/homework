package com.hillel.java;

/**
 4. Найти результат операции:
 x * x; если x < 9
 result =  x + 9; если x = 9
 x - 8; если x > 9 */

public class Task4 {
  public static void main(String[] args) {
    int x = 5;
    int res1 = 0;
    int res2 = 0;
    int res3 = 0;

//    for (int i = 0; i < x ; i++) {


      if (x < 9) {
        res1 = x * x;
      } else if (x == 9) {
        res2 = x + 9;
      } else if (x > 9) {
        res3 = x - 8;
      }
    System.out.println("rez1 " + res1 + " res2 " + res2 + " res3 " + res3);

  }
}



