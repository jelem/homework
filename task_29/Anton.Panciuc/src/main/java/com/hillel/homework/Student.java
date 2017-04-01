package com.hillel.homework;

import static com.hillel.homework.Cesar.decrypt;
import static com.hillel.homework.Cesar.encrypt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class Student implements Externalizable {
  private String firstName;
  private String lastName;
  private int age;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public Student() {

  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Student{"
        + "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", age=" + age + '}';
  }

  public void writeExternal(ObjectOutput out) throws IOException {
    firstName = encrypt(firstName);
    lastName = encrypt(lastName);
    age = age >> 2;
    out.writeObject(firstName);
    out.writeObject(lastName);
    out.writeInt(age);
  }

  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    firstName = decrypt((String) in.readObject());
    lastName = decrypt((String) in.readObject());
    age = in.readInt() << 2;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Student student = (Student) obj;
    return age == student.age
        && Objects.equals(firstName, student.firstName)
        && Objects.equals(lastName, student.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age);
  }
}
