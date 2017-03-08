package com.hillel.tasks.third;

public class Poor implements ServiceLevel {

  @Override
  public double tipsAmount(double bill) {
    return bill * 0.05;
  }
}
