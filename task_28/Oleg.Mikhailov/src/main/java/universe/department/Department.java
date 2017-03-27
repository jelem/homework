package universe.department;

import java.util.ArrayList;
import java.util.List;

public class Department {

  private String nameDepart;
  private Employee bossOfDepart;
  private List<Department> departments;
  private List<Employee> employees;

  public Department(String nameDepart, Employee bossOfDepart) {
    this.nameDepart = nameDepart;
    this.bossOfDepart = bossOfDepart;
    this.departments = new ArrayList<>();
    this.employees = new ArrayList<>();
  }

  public void addEmployes(Employee employee) {
    this.employees.add(employee);
    employee.setDepartment(nameDepart);
  }

  public void addSubordinateDeparts(Department depart) {
    departments.add(depart);
  }

  public String showDepartStructure(Department department) {
    if (departments.isEmpty()) {
      System.out.println("Department{"
          + ", nameDepart='" + nameDepart + '\''
          + ", bossOfDepart=" + bossOfDepart
          + ", departments=" + departments
          + '}');
      return this.toString();
    }
    Department selected = department;
    System.out.println(selected);
    return selected.toString();
  }

  public String showHeadDeparts() {
    System.out.println(bossOfDepart);
    return bossOfDepart.toString();
  }


  public String showEmployees() {
    System.out.println(employees);
    return employees.toString();
  }

  @Override
  public String toString() {
    return "Department{"
        + "nameDepart='" + nameDepart + '\''
        + ", bossOfDepart=" + bossOfDepart
        + ", departments=" + departments
        + '}';
  }


  public String getNameDepart() {
    return nameDepart;
  }

  public Employee getBossOfDepart() {
    return bossOfDepart;
  }

  public List<Department> getDepartments() {
    return departments;
  }

  public List<Employee> getEmployees() {
    return employees;
  }


}
