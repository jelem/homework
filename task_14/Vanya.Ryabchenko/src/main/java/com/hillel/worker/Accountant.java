package com.hillel.worker;

public class Accountant implements Worker {

  private String name;
  private int age;

  public Accountant(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void work() {
    System.out.println("I'm doing finances");
  }

  @Override
  public String toString() {
    return "Accountant{"
        +
        "name='"
        +
        name
        +
        '\''
        +
        ", age="
        +
        age
        +
        '}';
  }
}
