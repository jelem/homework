package universe.department;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestUnivers {

  Employee rector;
  Employee prorecorAcademic;
  Employee prorecorScientific;
  Employee facultHeadComputer;
  Employee facultHeadLanguage;
  Employee headDeaprt1;
  Employee headDeaprt2;
  Employee headDeaprt3;
  Employee headDeaprt4;

  Department rectorate;
  Department proRectorate1;
  Department proRectorate2;
  Department facultyComputer;
  Department facultyLanguage;
  Department departmentOfUnivercity1;
  Department departmentOfUnivercity2;
  Department departmentOfUnivercity3;
  Department departmentOfUnivercity4;

  @Before
  public void setUp() {
    rector = new Employee("Oleg", "Mikhailov");
    prorecorAcademic = new Employee("Max", "Pain");
    prorecorScientific = new Employee("Tom", "Hawk");
    facultHeadComputer = new Employee("Lara", "Stom");
    facultHeadLanguage = new Employee("Sarah", "Conor");
    headDeaprt1 = new Employee("Kira", "True");
    headDeaprt2 = new Employee("Saha", "False");
    headDeaprt3 = new Employee("Olga", "Pol");
    headDeaprt4 = new Employee("Dima", "Tramp");
    rectorate = new Department("Rectorate", rector);
    proRectorate1 = new Department("Pro-rectorate of academic affairs",
        prorecorAcademic);
    proRectorate2 = new Department("Pro-rectorate for scientific work",
        prorecorScientific);
    facultyComputer = new Department("Faculty of computer technology",
        facultHeadComputer);
    facultyLanguage = new Department("Faculty of foreign languages",
        facultHeadLanguage);
    departmentOfUnivercity1 = new Department("KNAS", headDeaprt1);
    departmentOfUnivercity2 = new Department("LDI", headDeaprt2);
    departmentOfUnivercity3 = new Department("English", headDeaprt3);
    departmentOfUnivercity4 = new Department("French", headDeaprt4);
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


}
