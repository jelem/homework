package com.hillel.tasks.task3;


public class Poor implements Servis {
  @Override
  public double tips(double score) {
    return score * 0.05;
  }
}
