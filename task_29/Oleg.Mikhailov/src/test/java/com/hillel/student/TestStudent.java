package com.hillel.student;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {

  Student student;
  Caesar caesar;
  ObjectInputStream objectInputStream;
  ObjectOutputStream objectOutputStream;
  Student outStudent;
  FileInputStream inputFile;
  FileOutputStream file;

  @Before
  public void setUp() throws IOException, ClassNotFoundException {
    student = new Student("Saha", "Mikhailov", 10);
    caesar = new Caesar();

    ;
    file = new FileOutputStream(
        "student.txt");

    objectOutputStream = new ObjectOutputStream(file);

    objectOutputStream.writeObject(student);
    objectOutputStream.flush();
    objectOutputStream.close();

    inputFile = new FileInputStream(
        "student.txt");
  }

  @Test
  public void testReadInputFile() throws IOException, ClassNotFoundException {
    objectInputStream = new ObjectInputStream(inputFile);
    outStudent = (Student) objectInputStream.readObject();
    boolean result = outStudent == null;
    assertThat(result, is(false));
    assertThat(outStudent.getFirstname(), is("Saha"));
  }

  @Test
  public void testCaesarNameEncryption() {
    String name = "Mikhailov";
    assertThat(caesar.nameEncryption(name), is("Vrtqjruxe"));
  }

  @Test
  public void testCaesarNameDecryption() {
    String name = "Vrtqjruxe";
    assertThat(caesar.nameDecryption(name), is("Mikhailov"));
  }

  @Test
  public void testCaesarAgeEncryption() {
    int age = 15;
    assertThat(caesar.ageEncryption(age), is(1845));
  }

  @Test
  public void testCaesarAgeDecryption() {
    int age = 1845;
    assertThat(caesar.ageDecryption(age), is(15));
  }

  @Test(expected = NullPointerException.class)
  public void testCaesarExeptionNameEncryption() {
    String name = null;
    caesar.nameEncryption(name);
  }

  @Test(expected = NullPointerException.class)
  public void testCaesarExeptionNameDecryption() {
    String name = null;
    caesar.nameDecryption(name);
  }

}
