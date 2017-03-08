package com.hillel.tasks.third;

public class Excellent implements ServiceLevel {

  @Override
  public double tipsAmount(double bill) {
    return bill * 0.2;
  }
}
