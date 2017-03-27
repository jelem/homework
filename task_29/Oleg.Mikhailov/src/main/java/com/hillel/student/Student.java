package com.hillel.student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

  private String firstname;
  private String lastname;
  private int age;

  public Student(String firstname, String lastname, int age) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
  }

  @Override
  public void writeExternal(ObjectOutput objectOutput) throws IOException {
    objectOutput.writeObject(firstname);
    objectOutput.writeObject(lastname);
    objectOutput.writeObject(age);
  }

  @Override
  public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
    firstname = (String) objectInput.readObject();
    lastname = (String) objectInput.readObject();
    age = objectInput.readInt();
  }

  @Override
  public String toString() {
    return "Student{" +
        "firstname='" + firstname + '\'' +
        ", lastname='" + lastname + '\'' +
        ", age=" + age +
        '}';
  }
}
