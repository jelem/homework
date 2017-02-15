package com.hillel.tasks.task3;

/**
 * Created by TUZ on 08.02.2017.
 */
public class Excellent implements Servis {
  @Override
  public double tips(double score) {
    return score * 0.2;
  }
}
