package com.hillel.worker;

public class Boss implements Worker {

  private String name;
  private int age;

  public Boss(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void work() {
    System.out.println("I run a company");
  }

  @Override
  public String toString() {
    return "Boss{"
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
