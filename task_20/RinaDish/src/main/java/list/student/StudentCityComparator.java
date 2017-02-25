package list.student;

import java.io.Serializable;
import java.util.Comparator;


public class StudentCityComparator implements Comparator<Student>, Serializable {


  @Override
  public int compare(Student o1, Student o2) {
    return o1.getCity().getName().compareTo(o2.getCity().getName());
  }
}
