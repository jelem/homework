package com.hillel.tasks.second;

public class SecondWorker implements Worker {

  private String name;

  public SecondWorker(String name) {
    this.name = name;
  }

  @Override
  public void work() {
    System.out.println("I'm make mobile");
  }

  public String getName() {
    return name;
  }
}
