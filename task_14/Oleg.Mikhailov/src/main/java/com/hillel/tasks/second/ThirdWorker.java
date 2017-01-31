package com.hillel.tasks.second;

public class ThirdWorker implements Worker {

  private String name;

  public ThirdWorker(String name) {
    this.name = name;
  }

  @Override
  public void work() {
    System.out.println("I'm make plain");
  }

  public String getName() {
    return name;
  }
}
