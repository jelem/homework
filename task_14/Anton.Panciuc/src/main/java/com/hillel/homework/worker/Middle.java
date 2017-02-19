package com.hillel.homework.worker;


public class Middle implements Worker {
  @Override
  public void work() {
    System.out.println("I am middle, i do main part of the work");
  }
}
