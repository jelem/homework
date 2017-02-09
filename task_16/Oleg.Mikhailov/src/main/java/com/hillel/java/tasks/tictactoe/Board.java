package com.hillel.java.tasks.tictactoe;

public interface Board {

  void fillCell(int row, int column, char symbol);

  char getSymbol(int row, int column);

  void printBoard();


}
