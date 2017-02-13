package com.hillel.homework.tictactoe;

public class BoardTicTacToe extends Board {


  public BoardTicTacToe() {
    cells = new Cell[ROWS][COLS];
    for (int row = 0; row < ROWS; ++row) {
      for (int col = 0; col < COLS; ++col) {
        cells[row][col] = new Cell(row, col);
      }
    }
  }

  @Override
  public void init() {
    for (int row = 0; row < ROWS; ++row) {
      for (int col = 0; col < COLS; ++col) {
        cells[row][col].clear();
      }
    }
  }

  @Override
  public void paint() {
    for (int row = 0; row < ROWS; ++row) {
      for (int col = 0; col < COLS; ++col) {
        cells[row][col].paint();
        if (col < COLS - 1) {
          System.out.print("|");
        }
      }
      System.out.println();
      if (row < ROWS - 1) {
        System.out.println();
      }
    }
  }

  @Override
  public boolean isDraw() {
    for (int row = 0; row < ROWS; ++row) {
      for (int col = 0; col < COLS; ++col) {
        if (cells[row][col].content == Field.EMPTY) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public boolean hasWon(Field field) {

    if ((cells[0][0].content == cells[1][1].content
        && cells[0][0].content == cells[2][2].content
        && cells[0][0].content == field)
        || (cells[0][2].content == cells[1][1].content
        && cells[0][2].content == cells[2][0].content
        && cells[0][2].content == field)) {

      return true;
    }
    for (int i = 0; i < 3; ++i) {
      if (((cells[i][0].content == cells[i][1].content
          && cells[i][0].content == cells[i][2].content
          && cells[i][0].content == field)
          || (cells[0][i].content == cells[1][i].content
          && cells[0][i].content == cells[2][i].content
          && cells[0][i].content == field))) {
        return true;
      }
    }
    return false;
  }

}
