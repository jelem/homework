package com.hillel.homework;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {
  Student student;
  Student testStudent;

  @Before
  public void setUp() {
    student = new Student("John", "Doe", 20);
    testStudent = new Student("John", "Doe", 20);
  }

  @Test
  public void deserializationTest() throws IOException, ClassNotFoundException {
    File file =
        new File("Testfile.txt");

    FileOutputStream fileOutputStream =
        new FileOutputStream(file);
    ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
    outputStream.writeObject(student);
    outputStream.flush();
    outputStream.close();

    FileInputStream fileInputStream =
        new FileInputStream(file);
    ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
    Student testStudent2 = (Student) inputStream.readObject();
    inputStream.close();

    assertThat(testStudent2, is(testStudent));

  }
}
