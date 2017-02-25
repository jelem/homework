package list.student;

import java.io.Serializable;
import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>, Serializable {


  @Override
  public int compare(Student o1, Student o2) {
    return o2.getAge() - o1.getAge();
  }
}
