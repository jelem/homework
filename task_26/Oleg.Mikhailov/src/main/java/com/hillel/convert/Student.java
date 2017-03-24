package com.hillel.convert;

public class Student {

  private String lastname;
  private String firstname;
  private int age;

  public Student(String lastname, String firstname, int age) {
    this.lastname = lastname;
    this.firstname = firstname;
    this.age = age;
  }

  public String getLastname() {
    return lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public int getAge() {
    return age;
  }


}
