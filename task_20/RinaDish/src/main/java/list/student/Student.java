package list.student;

import javax.print.attribute.standard.Chromaticity;

public class Student implements Comparable<Student> {

  private String name;
  private int age;
  private City city;

  public Student(String name, int age, City city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Student student = (Student) obj;

    if (age != student.age) {
      return false;
    }
    if (!name.equals(student.name)) {
      return false;
    }
    return city.equals(student.city);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + age;
    result = 31 * result + city.hashCode();
    return result;
  }

  @Override
  public int compareTo(Student student) {
    return this.name.compareTo(student.name);
  }

  public int getAge() {
    return age;
  }

  public City getCity() {
    return city;
  }

  @Override
  public String toString() {
    return "Student{"
        +
        "name='"
        +
        name
        +
        '\''
        +
        ", age="
        +
        age
        +
        ", city="
        +
        city
        +
        '}';
  }
}
