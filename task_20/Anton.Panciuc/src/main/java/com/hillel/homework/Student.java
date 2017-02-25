package com.hillel.homework;


public class Student implements Comparable<Student> {
  private String name;
  private int age;
  private City city;

  private Student(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.city = builder.city;
  }

  public static class Builder {
    private static final String NO_INFO = "no info";
    private String name = NO_INFO;
    private int age = 17;
    private City city;

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Builder setCity(City city) {
      this.city = city;
      return this;
    }

    public Student build() {
      return new Student(this);
    }
  }

  public int getAge() {
    return age;
  }

  public City getCity() {
    return city;
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (object.getClass() != this.getClass()) {
      return false;
    }
    Student student = (Student) object;
    if (!name.equals(student.name)) {
      return false;
    }
    if (age != student.age) {
      return false;
    }
    return city == student.city;
  }

  @Override
  public String toString() {
    String string = name + ", " + age + ", ";
    if (city == null) {
      string += "No information found";
    } else {
      string += city.toString();
    }
    return string + '\n';
  }

  public int compareTo(Student object) {
    return name.compareTo(object.name);
  }

  public int hashCode() {
    assert false : "hashCode not designed";
    return 42;
  }

}