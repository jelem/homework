package com.hillel.java;

/**
 6. ����� ��������� � 10 �� 2� �������� ����� "a" � "b".
 ��������, ����� ����� 8 � 11 ��������� � ������ 11. */

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





