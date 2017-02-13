package com.hillel.homework.tictactoe;

public abstract class Board {
  public static final int ROWS = 3;
  public static final int COLS = 3;
  Cell[][] cells;

  void init() {
  }

  void paint() {
  }

  boolean isDraw() {
    return true;
  }

  boolean hasWon(Field field) {
    return true;
  }
}
