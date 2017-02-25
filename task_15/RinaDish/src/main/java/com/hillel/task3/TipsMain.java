package com.hillel.task3;

public class TipsMain {

  public static void main(String[] args) {
    double money = 10;
    LevelOfService terrible = new Terrible();
    System.out.println(terrible.tips(money));
    LevelOfService poor = new Poor();
    System.out.println(poor.tips(money));
    LevelOfService good = new Good();
    System.out.println(good.tips(money));
    LevelOfService great = new Great();
    System.out.println(great.tips(money));
    LevelOfService exellent = new Exellent();
    System.out.println(exellent.tips(money));


  }

}
