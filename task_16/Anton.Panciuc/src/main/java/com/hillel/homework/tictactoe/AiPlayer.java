package com.hillel.homework.tictactoe;


public class AiPlayer extends Player {

  protected Difficulty difficulty;


  public AiPlayer(Difficulty difficulty) {
    this.name = "Computer";
    this.difficulty = difficulty;
  }


  @Override
  public void playerMove(Board board) {
    Field symbol = getSymbol();
    difficulty.playerMove(board, symbol);
  }
}
