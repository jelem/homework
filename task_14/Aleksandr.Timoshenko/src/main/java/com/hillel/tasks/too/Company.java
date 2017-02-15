package com.hillel.tasks.too;

public class Company {

  public static void main(String[] args) {
    Manager arturPirozhkov = new Manager("Artur", "Pirozhkov");
    Accountant alinaKabaeva = new Accountant("Alina", "Kabaeva");
    Developer billGates = new Developer("Bill", "Gates");

    Employee[] workDay = new Employee[4];

    workDay[0] = arturPirozhkov;
    workDay[1] = alinaKabaeva;
    workDay[2] = billGates;
    for (int i = 0; i < workDay.length; i++) {
      workDay[i].startWork();
    }
  }

}
