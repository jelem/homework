package student;


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
    if (!(obj instanceof Student)) {
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

  public City getCity() {
    return city;
  }

  public int getAge() {
    return age;
  }
}
