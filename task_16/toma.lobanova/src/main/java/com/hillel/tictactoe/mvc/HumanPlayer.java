package com.hillel.tictactoe.mvc;

public class HumanPlayer implements Player {
  private CellState symbol;
  String name = "human";
  UserMove userMove;

  public HumanPlayer(UserMove userMove) {
    this.userMove = userMove;
  }

  public boolean needUserMove() {
    return true;
  }

  @Override
  public void reset() {
  }

  public Move makeMove() {
    return userMove.getMove();
  }

  public CellState getPlayerSymbol() {
    return symbol;
  }

  public void setPlayerSymbol(CellState state) {
    symbol = state;
  }

  public String getName() {
    return name;
  }
}
