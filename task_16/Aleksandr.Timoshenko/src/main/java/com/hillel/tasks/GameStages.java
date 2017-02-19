package com.hillel.tasks;

public interface GameStages {

  void startGame();

  void gameLogic();

  boolean gameFinish();

  void winnerIs(Player player);

}
