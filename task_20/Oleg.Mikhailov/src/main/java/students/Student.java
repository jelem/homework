package students;

public class Student implements Comparable<Student> {

  private String name;
  private int age;
  private City city;

  public Student(String name, int age, City city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getCityName() {
    return city.getCityName();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (obj.getClass() != this.getClass()) {
      return false;
    }

    Student student = (Student) obj;

    if (!student.getName().equals(this.name)) {
      return false;
    }

    if (student.getAge() != this.age) {
      return false;
    }

    if (!student.city.equals(this.city)) {
      return false;
    }

    return true;
  }


  @Override
  public String toString() {
    return name + " " + age + " " + city;
  }

  public int compareTo(Student student) {
    return name.compareTo(student.name);
  }

  public int hashCode() {
    assert false : "hashCode not designed";
    return 42;
  }
}
