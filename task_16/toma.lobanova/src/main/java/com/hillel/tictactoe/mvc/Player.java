package com.hillel.tictactoe.mvc;

public interface Player {
  Move makeMove();

  CellState getPlayerSymbol();

  void setPlayerSymbol(CellState state);

  String getName();

  boolean needUserMove();

  void reset();
}
