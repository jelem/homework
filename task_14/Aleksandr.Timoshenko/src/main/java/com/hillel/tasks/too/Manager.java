package com.hillel.tasks.too;

public class Manager implements Employee {

  private String name;
  private String surname;

  public Manager(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  @Override
  public void startWork() {
    System.out.println("Manager started to work");
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getSurname() {
    return surname;
  }
}
