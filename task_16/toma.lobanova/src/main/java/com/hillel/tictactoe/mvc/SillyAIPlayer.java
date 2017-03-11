package com.hillel.tictactoe.mvc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

public class SillyAIPlayer extends AIPlayer {

  public SillyAIPlayer(Board board, AIRandom random) {
    super(board, random);
  }

  @Override
  public Move makeMove() {
    return makeEasyMove();
  }

}
