package com.hillel.tasks.too;

public class Developer implements Employee {

  private String name;
  private String surname;

  public Developer(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  @Override
  public void startWork() {
    System.out.println("Developer started to work");
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
