package com.hillel.tictactoe.mvc;

public abstract class AIPlayer implements Player {
  protected Board board;
  private CellState symbol;
  private String name = "AI";
  AIRandom rand;

  public AIPlayer(Board board, AIRandom random) {
    this.board = board;
    rand = random;
  }

  public Board getBoard() {
    return board;
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

  public abstract Move makeMove();

  public CellState getPlayerSymbol() {
    return symbol;
  }

  public void setPlayerSymbol(CellState state) {
    symbol = state;
  }

  public String getName() {
    return name;
  }

  public boolean needUserMove() {
    return false;
  }
}
