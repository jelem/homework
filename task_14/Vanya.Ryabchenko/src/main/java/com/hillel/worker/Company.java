package com.hillel.worker;

public class Company {

  public static void main(String[] args) {

    Worker[] company = new Worker[3];
    company[0] = new Boss("John", 34);
    company[1] = new Accountant("Liza", 25);
    company[2] = new Courier("Alex", 20);

    for (int i = 0; i < company.length; i++) {
      company[i].work();
    }
  }
}
