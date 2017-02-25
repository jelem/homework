package com.hillel.homework.train;


public class Main {
  public static void main(String[] args) {
    Train train = new Train(5);

    for (int i = 1; i < 5; i++) {
      for (int j = 1; j < 37; j++) {
        train.sellSit(i, j);
      }
    }

    train.refundSit(1, 15);

    train.printTrainStatus();

  }
}
