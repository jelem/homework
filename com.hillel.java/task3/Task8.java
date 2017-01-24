package com.hillel.java;

/** 8. ѕосчитайте, сколько будет стоить аренда квартиры за
 заданное число дней, если известно, что за 1 день ее стоимость 40 грн.
 ѕричем, если съемщик прожил в ней больше 5 дней,
 он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
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
