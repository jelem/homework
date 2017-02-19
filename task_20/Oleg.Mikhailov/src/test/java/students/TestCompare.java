package students;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TestCompare {

  List<Student> students = new ArrayList<Student>();
  List<Student> expectedResult = new ArrayList<Student>();
  Student student1;
  Student student2;
  Student student3;
  City city1;
  City city2;
  City city3;

  @Before
  public void setUp() {
    city1 = new City("Ukraine", "Odessa");
    city2 = new City("Ukraine", "Yuzhny");
    city3 = new City("Ukraine", "Kiev");
    student1 = new Student("Oleg", 19, city1);
    student2 = new Student("Bbeg", 20, city2);
    student3 = new Student("Baeg", 12, city3);
    students.add(student1);
    students.add(student2);
    students.add(student3);
  }

  @Test
  public void testEqualsStudent() {
    assertThat(student1.equals(student2), is(false));

    Student student4 = new Student("Oleg", 19, city1);
    assertThat(student1.equals(student4), is(true));
  }

  @Test
  public void testDefaultSort() {
    Collections.sort(students);
    expectedResult.add(student3);
    expectedResult.add(student2);
    expectedResult.add(student1);

    assertThat(students.toString(), is(expectedResult.toString()));
  }

  @Test
  public void testReverseCompare() {
    Collections.sort(students, new CompareAgeReverse());
    expectedResult.add(student2);
    expectedResult.add(student1);
    expectedResult.add(student3);

    assertThat(students.toString(), is(expectedResult.toString()));
  }

  @Test
  public void testAnonCompare() {
    Collections.sort(students, new Comparator<Student>() {
      public int compare(Student o1, Student o2) {
        return o1.getCity().city.compareTo(o2.getCity().city);
      }
    });

    expectedResult.add(student3);
    expectedResult.add(student1);
    expectedResult.add(student2);
    assertThat(students.toString(), is(expectedResult.toString()));
  }

}
