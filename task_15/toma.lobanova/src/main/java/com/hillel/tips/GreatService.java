package com.hillel.tips;

public class GreatService implements Service {
  public long countTips(int check) {
    return Math.round(0.15 * check);
  }
}
