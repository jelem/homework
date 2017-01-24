package com.hillel.java;

/**
 **
 7. Две машины движутся в одну сторону с разными скоростями:
 Определить догонит ли вторая машина первую за t = 5 часов,
 если известно, что вторая машина отстает от первой на расстояние 100 км. */

public class Task7 {
  public static void main(String[] args) {

  int carSpeed1 = 30;
  int carSpeed2= 70;
  int sDifferBetwwenCars = 100;
    int time = 5;


   int diffBetweenCars = carSpeed2 -carSpeed1; //40 км разница
   int sForSwcondCar = sDifferBetwwenCars - diffBetweenCars;
   int timeForSecondCar = time *sForSwcondCar; //
    System.out.println(timeForSecondCar);

}
}
