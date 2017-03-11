package com.hillel.tasks.third;

public class Great implements ServiceLevel {

  @Override
  public double tipsAmount(double bill) {
    return bill * 0.15;
  }
}
