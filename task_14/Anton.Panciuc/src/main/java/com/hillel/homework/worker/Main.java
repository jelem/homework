package com.hillel.homework.worker;


public class Main {
  public static void main(String[] args) {
    Worker[] company = new Worker[3];
    company[0] = new Junior();
    company[1] = new Middle();
    company[2] = new Senior();

    for (int i = 0; i < company.length; i++) {
      company[i].work();
    }
  }
}
