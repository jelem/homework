package com.hillel.tasks;

public class Guest {
  private String name;
  private String surname;
  private int age = 20;

  public static class Builder {
    private static final String UNSET = "unset";
    private String name = UNSET;
    private String surname = UNSET;
    private int age = 20;

    public Builder setName(String name) {
      if (name != null) {
        this.name = name;
      }
      return this;
    }

    public Builder setSurname(String surname) {
      if (name != null) {
        this.surname = surname;
      }
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Guest build() {
      return new Guest(this);
    }
  }

  private Guest(Builder builder) {
    name = builder.name;
    surname = builder.surname;
    age = builder.age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }

    Guest guest = (Guest) object;

    if (age != guest.age) {
      return false;
    }
    if (!name.equals(guest.name)) {
      return false;
    }
    return surname.equals(guest.surname);
  }

  @Override
  public int hashCode() {
    int code = surname.toUpperCase().charAt(0) - 65;
    return code;
  }
}
