package com.hillel.java;

/** 8. ����������, ������� ����� ������ ������ �������� ��
 �������� ����� ����, ���� ��������, ��� �� 1 ���� �� ��������� 40 ���.
 ������, ���� ������� ������ � ��� ������ 5 ����,
 �� ������� ������ 20 ���, � ���� ������ 7 ����, �� ������ �������� 50 ���.
  */
public class Task8 {
  public static void main(String[] args) {


  int daysNumber=6;
  int forOneDay = 40;
  int res1 = forOneDay*daysNumber;

  if (daysNumber>=5 && daysNumber<7) {
    res1 -=20;
    System.out.println("the rent for appartment is " + res1 +" hrn more than 5 days");
  }else if (daysNumber > 7)
    res1-=50;
    System.out.println("the rent for appartment is " + res1 + " hrn more than 7 days");
  }
}
