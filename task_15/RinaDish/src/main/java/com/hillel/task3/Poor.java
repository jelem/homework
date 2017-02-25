package com.hillel.task3;

public class Poor implements LevelOfService {

  public double tips(double money) {
    double sum = money + (money / 100 * 5);
    return sum;
  }
}
