package com.hillel.tictactoe.mvc;

public class Move {
  private int rowCoordinate;
  private int columnCoordinate;

  public Move(int row, int column) {
    rowCoordinate = row;
    columnCoordinate = column;
  }

  public int getRowCoordinate() {
    return rowCoordinate;
  }

  public int getColumnCoordinate() {
    return columnCoordinate;
  }

  public void setRowCoordinate(int rowCoordinate) {
    this.rowCoordinate = rowCoordinate;
  }

  public void setColumnCoordinate(int columnCoordinate) {
    this.columnCoordinate = columnCoordinate;
  }
}
