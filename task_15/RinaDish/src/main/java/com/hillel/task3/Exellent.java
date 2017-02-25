package com.hillel.task3;

public class Exellent implements LevelOfService {

  public double tips(double money) {
    double sum = money + (money / 100 * 20);
    return sum;
  }
}
