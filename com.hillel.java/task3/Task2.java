package com.hillel.java;

/**
 . Пользователь вводит длины катетов прямоугольного треугольника. Написать функцию,
 которая вычислит и выведет в консоль площадь треугольника и его периметр.
 */
public class Task2 {


  public static void main(String[] args) {

    int a = 40;
    int b = 45;
    System.out.println("Площадь " + (a + b)/2 );
    double c = Math.sqrt(a*b+b*b); //гипотенуза
    System.out.println("Периметр " + (a+b+c) );
  }

}