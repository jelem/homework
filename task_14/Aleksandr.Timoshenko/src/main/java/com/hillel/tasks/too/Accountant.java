package com.hillel.tasks.too;

public class Accountant implements Employee {

  private String name;
  private String surname;

  public Accountant(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  @Override
  public void startWork() {
    System.out.println("Accountant started to work");
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
