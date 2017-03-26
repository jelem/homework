package universe.department;

import java.util.ArrayList;
import java.util.List;

public class Department {

  private String nameDepart;
  private Employee bossOfDepart;
  private List<Department> departments;
  private List<Employee> employees;
  private List<Employee> headOfDepart = new ArrayList<>();

  public Department(String nameDepart, Employee bossOfDepart) {
    this.nameDepart = nameDepart;
    this.bossOfDepart = bossOfDepart;
    this.departments = new ArrayList<>();
    this.employees = new ArrayList<>();
  }

  public void addEmployes(Employee employee) {
    this.employees.add(employee);
  }

  public void addSubordinateDeparts(Department depart) {
    if (headOfDepart.isEmpty()) {
      headOfDepart.add(this.bossOfDepart);
    }
    headOfDepart.add(bossOfDepart);
    departments.add(depart);
  }

  public void showDepartStructure(Department department) {
    if (departments.isEmpty()) {
      System.out.println("Department{" +
          ", nameDepart='" + nameDepart + '\'' +
          ", bossOfDepart=" + bossOfDepart +
          ", departments=" + departments +
          '}');
      return;
    }
    Department selected = department;
    System.out.println(selected);
  }

  public void showHeadDeparts() {
//todo
  }


  public void showEmployees() {
    System.out.println(employees);
  }

  @Override
  public String toString() {
    return "Department{" +
        ", nameDepart='" + nameDepart + '\'' +
        ", bossOfDepart=" + bossOfDepart +
        ", departments=" + departments +
        '}';
  }
}
