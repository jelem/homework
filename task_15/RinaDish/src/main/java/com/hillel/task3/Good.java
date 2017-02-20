package com.hillel.task3;

public class Good implements LevelOfService {

  public double tips(double money) {
    double sum = money + (money / 100 * 10);
    return sum;
  }
}
