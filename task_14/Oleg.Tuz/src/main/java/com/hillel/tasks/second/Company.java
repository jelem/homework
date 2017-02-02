package com.hillel.tasks.second;

public class Company {
  public static void main(String[] args) {
    Worker Oleg = new Director("Oleg");
    Worker Anna = new Accountant("Anna");
    Worker Anri = new Engineer("Anri");


    Worker[] companies = new Worker[3];
    companies[0] = Oleg;
    companies[1] = Anna;
    companies[2] = Anri;
    for (int i = 0; i < companies.length; i++) {

      System.out.println(companies[i].getName() + "  says:");
      companies[i].work();
    }
  }
}
