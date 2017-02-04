package com.hillel.tasks.third;

public class Great implements Service {

  @Override
  public double tips(double cost) {
    return 0.15 * cost;
  }
}
