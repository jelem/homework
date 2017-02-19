package com.hillel.tictactoe.mvc;

public interface Controller {
  void startGame();

  void processUserMove(Move move);

}
