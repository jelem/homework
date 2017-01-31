package com.hillel.tips;

public class ExcellentService implements Service {
  public long countTips(int check) {
    return Math.round(0.2 * check);
  }
}
