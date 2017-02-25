package com.hillel.homework;


import java.io.Serializable;
import java.util.Comparator;

public class CompareByAge implements Comparator<Student> , Serializable {
  public int compare(Student objectFirst, Student objectSecond) {
    return objectSecond.getAge() - objectFirst.getAge();
  }
}
