package com.hillel.tasks.second;

public class FirstWorker implements Worker {

  private String name;

  public FirstWorker(String name) {
    this.name = name;
  }

  @Override
  public void work() {
    System.out.println("I'm make car");
  }

  public String getName() {
    return name;
  }
}
