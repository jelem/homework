package com.hillel.java;

/**
 **
 7. ��� ������ �������� � ���� ������� � ������� ����������:
 ���������� ������� �� ������ ������ ������ �� t = 5 �����,
 ���� ��������, ��� ������ ������ ������� �� ������ �� ���������� 100 ��. */

public class Task7 {
  public static void main(String[] args) {

  int carSpeed1 = 30;
  int carSpeed2= 70;
  int sDifferBetwwenCars = 100;
    int time = 5;


   int diffBetweenCars = carSpeed2 -carSpeed1; //40 �� �������
   int sForSwcondCar = sDifferBetwwenCars - diffBetweenCars;
   int timeForSecondCar = time *sForSwcondCar; //
    System.out.println(timeForSecondCar);

}
}
