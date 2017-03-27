package universe.department;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestUnivers {

  Employee rector;
  Employee prorecorAcademic;
  Employee prorecorScientific;
  Employee headDeaprt1;
  Employee headDeaprt2;

  Department rectorate;
  Department proRectorate1;
  Department departmentOfUnivercity1;
  Department departmentOfUnivercity2;

  @Before
  public void setUp() {
    rector = new Employee("Oleg", "Mikhailov");
    prorecorAcademic = new Employee("Max", "Pain");
    prorecorScientific = new Employee("Tom", "Hawk");
    headDeaprt1 = new Employee("Kira", "True");
    headDeaprt2 = new Employee("Saha", "False");
    rectorate = new Department("Rectorate", rector);
    proRectorate1 = new Department("Pro-rectorate of academic affairs",
        prorecorAcademic);
    departmentOfUnivercity1 = new Department("KNAS", headDeaprt1);
    departmentOfUnivercity2 = new Department("LDI", headDeaprt2);
  }


  @Test
  public void testAddDepartEmployees() {
    rectorate.addEmployes(prorecorAcademic);
    rectorate.addEmployes(prorecorScientific);
    assertThat(rectorate.getEmployees().size(), is(2));
  }

  @Test
  public void testSetDepartNaeForEmployee() {
    rectorate.addEmployes(prorecorAcademic);
    assertThat(prorecorAcademic.getDepartment(), is(rectorate.getNameDepart()));
  }

  @Test
  public void testAddSubordinateDeparts() {
    rectorate.addSubordinateDeparts(departmentOfUnivercity1);
    assertThat(rectorate.getDepartments().size(), is(1));
    rectorate.addSubordinateDeparts(departmentOfUnivercity2);
    assertThat(rectorate.getDepartments().size(), is(2));
  }


  @Test
  public void testShowEmployee() {
    rectorate.addEmployes(headDeaprt1);
    rectorate.addEmployes(headDeaprt2);
    assertThat(rectorate.showEmployees(), is("[Kira True, Saha False]"));
  }

  @Test
  public void testShowHeadDeparts() {
    assertThat(rectorate.showHeadDeparts(), is("Oleg Mikhailov"));
  }

  @Test
  public void testEmptyShowDepartStructure() {
    assertThat(rectorate.toString(),
        is("Department{nameDepart='Rectorate', bossOfDepart=Oleg Mikhailov,"
            + " departments=[]}"));
  }

  @Test
  public void testShowDepartStructure() {
    rectorate.addSubordinateDeparts(proRectorate1);
    assertThat(rectorate.showDepartStructure(rectorate),
        is("Department{nameDepart='Rectorate', bossOfDepart=Oleg Mikhailov, departments="
            + "[Department{nameDepart='Pro-rectorate of academic affairs', bossOfDepart=Max Pain,"
            + " departments=[]}]}"));
  }

  @Test(expected = NullPointerException.class)
  public void testAddSubordinatesEmployeeIsEmpty() {
    Employee employee = null;
    headDeaprt1.addSubordinates(employee);
  }

  @Test
  public void testAddSubordianteEmpployee() {
    rector.addSubordinates(prorecorScientific);
    assertThat(rector.getSubordinates().size(), is(1));
    rector.addSubordinates(prorecorAcademic);
    assertThat(rector.getSubordinates().size(), is(2));
  }

}
