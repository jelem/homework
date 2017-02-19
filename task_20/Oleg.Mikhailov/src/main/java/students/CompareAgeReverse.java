package students;

import java.io.Serializable;
import java.util.Comparator;

public class CompareAgeReverse implements Comparator<Student>, Serializable {

  public int compare(Student o1, Student o2) {
    if (o1.getAge() > o2.getAge()) {
      return -1;
    } else if (o1.getAge() < o2.getAge()) {
      return 1;
    } else {
      return 0;
    }
  }
}
