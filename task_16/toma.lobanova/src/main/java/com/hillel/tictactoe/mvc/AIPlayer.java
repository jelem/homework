package com.hillel.tictactoe.mvc;

public abstract class AIPlayer extends Player {
  protected Board board;
  AIRandom rand;

  public AIPlayer(Board board, AIRandom random) {
    this.board = board;
    rand = random;
    setName("AI");
    setSurname("AI");
    setNick("AI");
  }

  @Override
  public String getType() {
    return "computer";
  }

  @Override
  public void setName(String name) {
    this.name = "AI";
  }

  @Override
  public void setSurname(String surname) {
    this.surname = "AI";
  }

  @Override
  public void setNick(String nick) {
    this.nick = "AI";
  }

  @Override
  public String getNick() {
    return nick;
  }

  public Move makeEasyMove() {
    int rowCoord;
    int colCoord;
    do {
      rowCoord = rand.getRandomData(board.getRows());
      colCoord = rand.getRandomData(board.getColumns());
    }
    while (board.getCellState(rowCoord, colCoord) != CellState.EMPTY);
    return new Move(rowCoord, colCoord);
  }

  @Override
  public boolean needUserMove() {
    return false;
  }
}
