package com.hillel.tasks.third;

public class Good implements Service {

  @Override
  public double tips(double cost) {
    return 0.1 * cost;
  }
}
