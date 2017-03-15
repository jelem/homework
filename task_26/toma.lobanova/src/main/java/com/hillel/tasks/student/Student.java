package com.hillel.tasks.student;

public class Student {
  private String lastName;
  private String name;
  private int age;

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static class Builder {
    private static final String UNSET = "unset";
    private String name = UNSET;
    private String lastName = UNSET;
    private int age = 20;

    public Builder setName(String name) {
      if (name != null) {
        this.name = name;
      }
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Builder setLastName(String lastName) {
      if (lastName != null) {
        this.lastName = lastName;
      }
      return this;
    }

    public Student build() {
      return new Student(this);
    }
  }

  private Student(Builder builder) {
    name = builder.name;
    lastName = builder.lastName;
    age = builder.age;
  }
}
