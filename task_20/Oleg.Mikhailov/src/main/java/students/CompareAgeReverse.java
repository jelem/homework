package students;

import java.io.Serializable;
import java.util.Comparator;

public class CompareAgeReverse implements Comparator<Student>, Serializable {

  public int compare(Student o1, Student o2) {
    return o2.getAge() - o1.getAge();
  }
}
