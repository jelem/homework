package com.hillel.tips;

public class PoorService implements Service {
  public long countTips(int check) {
    return Math.round(0.05 * check);
  }
}
