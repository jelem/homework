package students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    City city1 = new City("Ukraine", "Odessa");
    City city2 = new City("Ukraine", "Yuzhny");
    City city3 = new City("Ukraine", "Kiev");
    Student student1 = new Student("Oleg", 19, city1);
    Student student2 = new Student("Bbeg", 20, city2);
    Student student3 = new Student("Baeg", 12, city3);

    List<Student> students = new ArrayList<Student>();
    students.add(student1);
    students.add(student2);
    students.add(student3);

    Collections.sort(students, new Comparator<Student>() {
      public int compare(Student o1, Student o2) {
        return o1.getCity().city.compareTo(o2.getCity().city);
      }
    });
    System.out.println(students);

  }

}
