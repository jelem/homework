package com.hillel.java;

/**
 * 5.  5. ���� 3 ����� "a", "b" � "c". ����� ������������ �� ���.
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