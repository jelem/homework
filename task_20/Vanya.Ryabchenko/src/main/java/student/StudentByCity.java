package student;

import java.io.Serializable;
import java.util.Comparator;

public class StudentByCity implements Comparator<Student>, Serializable {


  @Override
  public int compare(Student student1, Student student2) {
    return student1.getCity().getName().compareTo(student2.getCity().getName());
  }
}
