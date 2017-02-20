package com.hillel.tictactoe.mvc;

public interface GameState {
  boolean isEndGame();

  String showWinner();

  CellState getCurrentPlayerSymbol();

  String getCurrentPlayerName();

  boolean isLegalMove(Move move);
}
