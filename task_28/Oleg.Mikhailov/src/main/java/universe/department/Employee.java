package universe.department;

import java.util.ArrayList;
import java.util.List;

public class Employee {

  private List<Employee> subordinates;
  private String firstname;
  private String lastname;
  private String department;

  public Employee(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.subordinates = new ArrayList<>();
  }

  public Employee() {
    this.firstname = "Unnamed";
    this.lastname = "Unnamed";
  }

  public void addSubordinates(Employee employee) {
    if (employee == null) {
      throw new NullPointerException("Empty empleyee");
    }
    subordinates.add(employee);
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getDepartment() {
    return department;
  }

  public List<Employee> getSubordinates() {
    return subordinates;
  }

  @Override
  public String toString() {
    return firstname + " " + lastname;
  }
}
