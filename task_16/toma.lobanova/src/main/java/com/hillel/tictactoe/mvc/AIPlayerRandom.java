package com.hillel.tictactoe.mvc;

import java.util.Random;

public class AIPlayerRandom implements AIRandom {
  Random rand = new Random();

  @Override
  public int getRandomData(int limit) {
    return rand.nextInt(limit);
  }
}
