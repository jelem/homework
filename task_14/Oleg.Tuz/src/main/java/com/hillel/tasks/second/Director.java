package com.hillel.tasks.second;


public class Director implements Worker {

  private String name;

  public Director(String name) {
    this.name = name;

  }

  public String getName() {
    return name;
  }

  @Override
  public void work() {
    System.out.println("I run a company");
  }

}
