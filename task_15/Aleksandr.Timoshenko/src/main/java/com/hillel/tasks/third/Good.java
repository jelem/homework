package com.hillel.tasks.third;

public class Good implements ServiceLevel {

  @Override
  public double tipsAmount(double bill) {
    return bill * 0.1;
  }
}
