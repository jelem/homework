package com.hillel.worker;

public class Courier implements Worker {

  private String name;
  private int age;

  public Courier(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void work() {
    System.out.println("I deliver goods");
  }

  @Override
  public String toString() {
    return "Courier{"
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
