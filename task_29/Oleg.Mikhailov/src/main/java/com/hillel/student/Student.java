package com.hillel.student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

  private String firstname;
  private String lastname;
  private int age;
  private Caesar caesar = new Caesar();

  public Student(String firstname, String lastname, int age) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
  }

  public Student() {
  }

  @Override
  public void writeExternal(ObjectOutput objectOutput) throws IOException {
    objectOutput.writeObject(caesar.nameEncryption(firstname));
    objectOutput.writeObject(caesar.nameEncryption(lastname));
    objectOutput.writeInt(caesar.ageEncryption(age));
  }

  @Override
  public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
    firstname = caesar.nameDecryption((String) objectInput.readObject());
    lastname = caesar.nameDecryption((String) objectInput.readObject());
    age = caesar.ageDecryption(objectInput.readInt());
  }

  @Override
  public String toString() {
    return "Student{"
        + "firstname='" + firstname + '\''
        + ", lastname='" + lastname + '\''
        + ", age=" + age
        + '}';
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public int getAge() {
    return age;
  }
}
