package student;

import java.io.Serializable;
import java.util.Comparator;

public class StudentByAge implements Comparator<Student>, Serializable {

  @Override
  public int compare(Student student1, Student student2) {
    return student2.getAge() - student1.getAge();
  }
}
