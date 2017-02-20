package list.student;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTest {

  public static void main(String[] args) {

    City odessa = new City("Odessa", 1);
    City lvov = new City("Lvov", 2);

    Student john = new Student("John", 30, odessa);
    Student sam = new Student("Sam", 25, lvov);
    Student katty = new Student("Katty", 23, lvov);

    List<Student> students = new ArrayList<>();
    students.add(john);
    students.add(sam);
    students.add(katty);

    Collections.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

    System.out.println(students.toString());
  }
}