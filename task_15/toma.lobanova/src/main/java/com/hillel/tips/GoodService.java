package com.hillel.tips;

public class GoodService implements Service {
  public long countTips(int check) {
    return Math.round(0.1 * check);
  }
}
