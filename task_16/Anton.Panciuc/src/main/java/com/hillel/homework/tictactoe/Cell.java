package com.hillel.homework.tictactoe;

public class Cell {

  Field content;

  int row;
  int col;


  public Cell(int row, int col) {
    this.row = row;
    this.col = col;
    clear();
  }


  public void clear() {
    content = Field.EMPTY;
  }


  public void paint() {
    switch (content) {
      case CROSS:
        System.out.print(" X ");
        break;
      case ZERO:
        System.out.print(" O ");
        break;
      case EMPTY:
        System.out.print("   ");
        break;
      default:
        break;
    }
  }
}
