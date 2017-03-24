package com.hillel.homework;

public class Guest {
  private String firstName;
  private String lastName;

  public Guest(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public int hashCode() {
    return (firstName != null) ? takeChar() : 0;
  }

  private int takeChar() {
    int number;
    if (lastName.charAt(0) == lastName.toLowerCase().charAt(0)) {
      number = lastName.charAt(0) - 'a';
      return number;
    }
    number = lastName.charAt(0) - 'A';
    return number;
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

    if (!firstName.equals(guest.firstName)) {
      return false;
    }
    return lastName.equals(guest.lastName);
  }

  @Override
  public String toString() {
    return firstName + " " + lastName;
  }
}
