package com.hillel.tasks.second;


public class Accountant implements Worker {
  private String name;

  public Accountant(String name) {
    this.name = name;

  }

  public String getName() {
    return name;
  }

  @Override
  public void work() {
    System.out.println("I do financial records");
  }
}
