package com.hillel.tictactoe.mvc;

import java.util.Random;

public class SillyAIPlayer extends AIPlayer {

  public SillyAIPlayer(Board board, AIRandom random) {
    super(board, random);
  }

  @Override
  public Move makeMove() {
    return makeEasyMove();
  }

  @Override
  public void reset() {
  }
}
