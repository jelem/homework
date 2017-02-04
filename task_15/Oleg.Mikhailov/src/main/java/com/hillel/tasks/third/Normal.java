package com.hillel.tasks.third;

public class Normal implements Service {

  @Override
  public double tips(double cost) {
    return 0.05 * cost;
  }
}
