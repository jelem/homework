package com.hillel.tasks.second;


public class Engineer implements Worker {
  private String name;

  public Engineer(String name) {
    this.name = name;

  }

  public String getName() {
    return name;
  }

  @Override
  public void work() {
    System.out.println("I designs a process technology");
  }
}
