package com.hillel.tasks.comparison;

public class Student implements Comparable<Student> {
  private String name;
  private int age;
  private City city;

  public int compareTo(Student object) {
    return name.compareTo(object.name);
  }

  public int getAge() {
    return age;
  }

  public City getCity() {
    return city;
  }

  public static class Builder {
    private static final String UNSET = "unset";
    private String name = UNSET;
    private int age = 20;
    private City city;

    public Builder setName(String name) {
      if (name != null) {
        this.name = name;
      }
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

  private Student(Builder builder) {
    name = builder.name;
    city = builder.city;
    age = builder.age;
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
    Student otherObject = (Student) object;
    if (!name.equals(otherObject.name)) {
      return false;
    }
    if (age != otherObject.age) {
      return false;
    }
    return city == otherObject.city;
  }

  @Override
  public String toString() {
    String string = name + ", " + age + ", ";
    if (city == null) {
      string += "unset place of living";
    } else {
      string += city.toString();
    }
    return string + '\n';
  }

  public int hashCode() {
    assert false : "hashCode not designed";
    return 42; // any arbitrary constant will do
  }
}
