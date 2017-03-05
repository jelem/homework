package hotell;

public class Visitor {
  private String firstName;
  private String lastName;

  public Visitor(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

/*  @Override
  public int hashCode() {
    return (firstName != null) ? takeChar() : 0;
  }

  private int takeChar() {
    int number;
    if (lastName.charAt(0) == lastName.toLowerCase().charAt(0)) {
      number = lastName.charAt(0) - 'a';
      return number;
    }
    number  = lastName.charAt(0) - 'A';
    return number;
  }*/

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Visitor visitor = (Visitor) o;

    if (firstName != null ? !firstName.equals(visitor.firstName) : visitor.firstName != null) {
      return false;
    }
    return lastName != null ? lastName.equals(visitor.lastName) : visitor.lastName == null;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? takeChar() : 0;
    return result;
  }

  private int takeChar() {
    int number;
    if (lastName.charAt(0) == lastName.toLowerCase().charAt(0)) {
      number = lastName.charAt(0) - 'a';
      return number;
    }
    number  = lastName.charAt(0) - 'A';
    return number;
  }
}
