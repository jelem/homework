package com.hillel.tasks.second;

public class Company {
  public static void main(String[] args) {
    Worker oleg = new Director("Oleg");
    Worker anna = new Accountant("Anna");
    Worker anri = new Engineer("Anri");


    Worker[] companies = new Worker[3];
    companies[0] = oleg;
    companies[1] = anna;
    companies[2] = anri;
    for (int i = 0; i < companies.length; i++) {

      System.out.println(companies[i].getName() + "  says:");
      companies[i].work();
    }
  }
}
