package com.hillel.tasks.workers;

import java.util.Random;

public class Main {

  static Random rnd = new Random();

  public static IWorker generatorOfWorkers() {
    int number = rnd.nextInt(4);
    switch (number) {
      case 0:
        return new Accountant();
      case 1:
        return new Mechanic();
      case 2:
        return new MetalWorker();
      case 3:
        return new OfficeManager();
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    IWorker[] enterprise = new IWorker[10];
    for (int i = 0; i < 10; i++) {
      enterprise[i] = generatorOfWorkers();
      enterprise[i].doWork();
    }
  }
}
