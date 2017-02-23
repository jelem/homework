package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    City odessa = new City("Odessa", 1);
    City lvov = new City("Lvov", 2);

    Student john = new Student("John", 30, odessa);
    Student sam = new Student("Sam", 25, lvov);
    Student kathy = new Student("Kathy", 23, lvov);

    List<Student> students = new ArrayList<>();

    students.add(john);
    students.add(sam);
    students.add(kathy);

    Collections.sort(students);
    System.out.println(students);

    Collections.sort(students, new StudentByAge());
    System.out.println(students);

    Collections.sort(students, new StudentByCity());
    System.out.println(students);

    Collections.sort(students, (student1, student2) -> student2.getAge() - student1.getAge());
    Collections.sort(students, (student1, student2) -> student1.getCity().getName()
        .compareTo(student2.getCity().getName()));
  }
}
