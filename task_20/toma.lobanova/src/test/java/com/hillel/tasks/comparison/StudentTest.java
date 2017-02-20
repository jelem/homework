package com.hillel.tasks.comparison;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class StudentTest {
  ArrayList<Student> students;

  @Test
  public void createStudentTest() {
    City city = new City.Builder()
        .setName("Odessa")
        .setCountry("Ukraine")
        .setRegion("Odesskaya")
        .build();
    Student student = new Student.Builder()
        .setAge(25)
        .setCity(city)
        .setName("Sergey")
        .build();
    assertThat(student.toString(), is(equalTo("Sergey, 25, Odessa, Odesskaya region, Ukraine\n")));
    student = new Student.Builder()
        .setName("Sergey")
        .build();
    assertThat(student.toString(), is(equalTo("Sergey, 20, unset place of living\n")));
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
        .setName("Odessa")
        .setCountry("Ukraine")
        .setRegion("Odesskaya")
        .build();
    City citySecond = new City.Builder()
        .setName("Kiev")
        .setRegion("Kievskaya")
        .setCountry("Ukraine")
        .build();
    City cityThird = new City.Builder()
        .setName("New York City")
        .setCountry("United States")
        .build();
    Student studentFirst = new Student.Builder()
        .setAge(32)
        .setCity(cityFirst)
        .setName("Sergey")
        .build();
    Student studentSecond = new Student.Builder()
        .setAge(25)
        .setCity(cityThird)
        .setName("Kseniya")
        .build();
    Student studentThird = new Student.Builder()
        .setAge(27)
        .setCity(citySecond)
        .setName("Olga")
        .build();
    Student studentFourth = new Student.Builder()
        .setAge(29)
        .setCity(cityThird)
        .setName("Alex")
        .build();
    Student studentFifth = new Student.Builder()
        .setAge(19)
        .setCity(cityFirst)
        .setName("Alexander")
        .build();
    students.add(studentFirst);
    students.add(studentSecond);
    students.add(studentThird);
    students.add(studentFourth);
    students.add(studentFifth);
  }

  private String createCitySortString() {
    return "Olga, 27, Kiev, Kievskaya region, Ukraine\n"
        + "Kseniya, 25, New York City, unset region, United States\n"
        + "Alex, 29, New York City, unset region, United States\n"
        + "Sergey, 32, Odessa, Odesskaya region, Ukraine\n"
        + "Alexander, 19, Odessa, Odesskaya region, Ukraine\n";
  }

  private String createAgeSortString() {
    return "Sergey, 32, Odessa, Odesskaya region, Ukraine\n"
        + "Alex, 29, New York City, unset region, United States\n"
        + "Olga, 27, Kiev, Kievskaya region, Ukraine\n"
        + "Kseniya, 25, New York City, unset region, United States\n"
        + "Alexander, 19, Odessa, Odesskaya region, Ukraine\n";
  }

  private String createNameSortString() {
    return "Alex, 29, New York City, unset region, United States\n"
        + "Alexander, 19, Odessa, Odesskaya region, Ukraine\n"
        + "Kseniya, 25, New York City, unset region, United States\n"
        + "Olga, 27, Kiev, Kievskaya region, Ukraine\n"
        + "Sergey, 32, Odessa, Odesskaya region, Ukraine\n";
  }
}
