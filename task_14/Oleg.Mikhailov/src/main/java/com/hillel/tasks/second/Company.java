package com.hillel.tasks.second;

public class Company {

  public static void main(String[] args) {
    Worker anna = new FirstWorker("Anna");
    Worker oleg = new SecondWorker("Oleg");
    Worker stas = new ThirdWorker("Stas");

    Worker[] companies = new Worker[3];
    companies[0] = anna;
    companies[1] = oleg;
    companies[2] = stas;

    for (int i = 0; i < companies.length; i++) {
      System.out.print(companies[i].getName() + " says: ");
      companies[i].work();
    }
  }
}
