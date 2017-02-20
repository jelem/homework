package com.hillel.tictactoe.mvc;

public interface Board {
  void reset();

  CellState getCellState(int row, int column);

  boolean isEndGame(CellState playerSymbol);

  void markCell(int row, int column, CellState state);

  int getRows();

  int getColumns();

  boolean isFull();
}

