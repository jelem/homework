package com.hillel.homework.worker;


public class Senior implements Worker {
  @Override
  public void work() {
    System.out.println("I am senior, I control junior and middle work");
  }
}
