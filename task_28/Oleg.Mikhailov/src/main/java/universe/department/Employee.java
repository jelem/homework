package universe.department;

import java.util.List;

public class Employee {

  private List<Employee> subordinates;
  private String firstname;
  private String lastname;

  public Employee(String firstname, String secondname) {
    this.firstname = firstname;
    this.lastname = secondname;
  }

  public void addSubordinates(Employee employee) {
    subordinates.add(employee);
  }


  @Override
  public String toString() {
    return firstname + " " + lastname ;
  }
}
