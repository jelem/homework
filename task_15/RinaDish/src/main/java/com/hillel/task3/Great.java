package com.hillel.task3;

public class Great implements LevelOfService {

  public double tips(double money) {
    double sum = money + (money / 100 * 15);
    return sum;
  }
}
