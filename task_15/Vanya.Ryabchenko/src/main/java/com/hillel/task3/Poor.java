package com.hillel.task3;


public class Poor implements ServiceLevel {

  public double tips(double money) {
    return 0.05 * money;
  }
}
