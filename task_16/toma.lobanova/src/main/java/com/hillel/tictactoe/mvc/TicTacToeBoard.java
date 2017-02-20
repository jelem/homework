package com.hillel.tictactoe.mvc;

public class TicTacToeBoard implements Board {
  private CellState[][] board;
  private int rows = 3;
  private int columns = 3;

  public TicTacToeBoard() {
    board = new CellState[rows][columns];
    reset();
  }

  public int getRows() {
    return rows;
  }

  public int getColumns() {
    return columns;
  }

  public boolean isFull() {
    return !containsEmptyCells();
  }

  public void reset() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        board[i][j] = CellState.EMPTY;
      }
    }
  }

  public boolean isEndGame(CellState playerSymbol) {
    int rowCoord;
    int colCoord;
    if (checkHorizontalLines(playerSymbol)) {
      return true;
    }
    if (checkVerticalLines(playerSymbol)) {
      return true;
    }
    if (checkDiagonals(playerSymbol)) {
      return true;
    }
    return !containsEmptyCells();
  }

  private boolean containsEmptyCells() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (board[i][j] == CellState.EMPTY) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean checkDiagonals(CellState playerSymbol) {
    if (board[0][0] == playerSymbol && board[1][1] == playerSymbol && board[2][2] == playerSymbol) {
      return true;
    }

    if (board[2][0] == playerSymbol && board[1][1] == playerSymbol && board[0][2] == playerSymbol) {
      return true;
    }
    return false;
  }

  private boolean checkVerticalLines(CellState playerSymbol) {
    for (int j = 0; j < columns; j++) {
      if (board[0][j] == playerSymbol && board[1][j] == playerSymbol && board[2][j] == playerSymbol) {
        return true;
      }
    }
    return false;
  }

  private boolean checkHorizontalLines(CellState playerSymbol) {
    for (int i = 0; i < rows; i++) {
      if (board[i][0] == playerSymbol && board[i][1] == playerSymbol && board[i][2] == playerSymbol) {
        return true;
      }
    }
    return false;
  }

  public CellState getCellState(int row, int column) {
    return board[row][column];
  }

  public void markCell(int row, int column, CellState state) {
    board[row][column] = state;
  }
}
