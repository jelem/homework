package com.hillel.tasks.comparison;

import java.io.Serializable;
import java.util.Comparator;

public class CompareByCity implements Comparator<Student>, Serializable {
  public int compare(Student objectFirst, Student objectSecond) {
    return objectFirst.getCity().compareTo(objectSecond.getCity());
  }
}
