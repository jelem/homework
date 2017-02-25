package com.hillel.homework;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class StudentTest {
  ArrayList<Student> students;

  @Test
  public void createStudentTest() {
    City city = new City.Builder()
        .setCityName("NewYork")
        .setCountry("USA")
        .build();
    Student student = new Student.Builder()
        .setAge(20)
        .setCity(city)
        .setName("Billy")
        .build();
    assertThat(student.toString(), is(equalTo("Billy, 20, NewYork, USA\n")));
    student = new Student.Builder()
        .setName("Tod")
        .build();
    assertThat(student.toString(), is(equalTo("Tod, 17, No information found\n")));
  }

  @Test
  public void sortByNameTest() {
    String string = createNameSortString();
    createStudents();
    Collections.sort(students);
    assertThat(listToString(students), is(equalTo(string)));
  }

  private String listToString(ArrayList<Student> list) {
    StringBuffer string = new StringBuffer();
    for (int i = 0; i < list.size(); i++) {
      string.append(list.get(i).toString());
    }
    return string.toString();
  }

  @Test
  public void sortByAgeTest() {
    createStudents();
    students.sort(new CompareByAge());
    assertThat(listToString(students), is(equalTo(createAgeSortString())));
  }

  @Test
  public void sortByAgeLambdaTest() {
    createStudents();
    students.sort((objectFirst, objectSecond) -> objectSecond.getAge() - objectFirst.getAge());
    assertThat(listToString(students), is(equalTo(createAgeSortString())));
  }

  @Test
  public void sortByCityLambdaTest() {
    createStudents();
    students.sort((objectFirst, objectSecond) -> objectFirst.getCity().compareTo(objectSecond.getCity()));
    assertThat(listToString(students), is(equalTo(createCitySortString())));
  }

  @Test
  public void sortByCityTest() {
    createStudents();
    students.sort(new CompareByCity());
    assertThat(listToString(students), is(equalTo(createCitySortString())));
  }

  private void createStudents() {
    students = new ArrayList<Student>();
    City cityFirst = new City.Builder()
        .setCityName("NewYork")
        .setCountry("USA")
        .build();
    City citySecond = new City.Builder()
        .setCityName("Chicago")
        .setCountry("USA")
        .build();
    Student studentFirst = new Student.Builder()
        .setAge(25)
        .setCity(cityFirst)
        .setName("Billy")
        .build();
    Student studentSecond = new Student.Builder()
        .setAge(20)
        .setCity(citySecond)
        .setName("Bob")
        .build();
    Student studentThird = new Student.Builder()
        .setAge(31)
        .setCity(citySecond)
        .setName("Dan")
        .build();
    students.add(studentFirst);
    students.add(studentSecond);
    students.add(studentThird);
  }

  private String createCitySortString() {
    return "Bob, 20, Chicago, USA\n"
        + "Dan, 31, Chicago, USA\n"
        + "Billy, 25, NewYork, USA\n";
  }

  private String createAgeSortString() {
    return "Dan, 31, Chicago, USA\n"
        + "Billy, 25, NewYork, USA\n"
        + "Bob, 20, Chicago, USA\n";
  }

  private String createNameSortString() {
    return "Billy, 25, NewYork, USA\n"
        + "Bob, 20, Chicago, USA\n"
        + "Dan, 31, Chicago, USA\n";
  }
}
