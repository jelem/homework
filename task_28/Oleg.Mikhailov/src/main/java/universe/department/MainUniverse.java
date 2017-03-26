package universe.department;

public class MainUniverse {

  public static void main(String[] args) {
    Employee rector = new Employee("Oleg", "Mikhailov");
    Employee prorecor_academic = new Employee("Max", "Pain");
    Employee prorecor_scientific = new Employee("Tom", "Hawk");
    Employee facultHead_computer = new Employee("Lara", "Stom");
    Employee facultHead_language = new Employee("Sarah", "Conor");
    Employee headDeaprt1 = new Employee("Kira", "True");
    Employee headDeaprt2 = new Employee("Saha", "False");
    Employee headDeaprt3 = new Employee("Olga", "Pol");
    Employee headDeaprt4 = new Employee("Dima", "Tramp");

    Department rectorate = new Department("Rectorate", rector);
    Department pro_rectorate1 = new Department("Pro-rectorate of academic affairs",
        prorecor_academic);
    Department pro_rectorate2 = new Department("Pro-rectorate for scientific work",
        prorecor_scientific);
    Department faculty_computer = new Department("Faculty of computer technology",
        facultHead_computer);
    Department faculty_language = new Department("Faculty of foreign languages",
        facultHead_language);
    Department departmentOfUnivercity1 = new Department("KNAS", headDeaprt1);
    Department departmentOfUnivercity2 = new Department("LDI", headDeaprt2);
    Department departmentOfUnivercity3 = new Department("English", headDeaprt3);
    Department departmentOfUnivercity4 = new Department("French", headDeaprt4);


    rectorate.addSubordinateDeparts(pro_rectorate1);
    rectorate.addSubordinateDeparts(pro_rectorate2);
    pro_rectorate1.addSubordinateDeparts(faculty_computer);
    pro_rectorate2.addSubordinateDeparts(faculty_language);
    faculty_computer.addSubordinateDeparts(departmentOfUnivercity1);
    faculty_computer.addSubordinateDeparts(departmentOfUnivercity2);
    faculty_language.addSubordinateDeparts(departmentOfUnivercity3);
    faculty_language.addSubordinateDeparts(departmentOfUnivercity4);


    rectorate.showDepartStructure(rectorate);

    rectorate.addEmployes(headDeaprt1);
    rectorate.addEmployes(headDeaprt2);

    rectorate.showEmployees();
  }
}
