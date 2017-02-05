package com.hillel.java.tasks.tictactoe;

public class TicTacToeBoard implements Board {

  private char[][] gameBoard;

  public TicTacToeBoard() {
    gameBoard = new char[3][3];
  }

  @Override
  public void fillCell(int row, int column, char symbol) {
    gameBoard[row][column] = symbol;
  }

  @Override
  public void printBoard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(gameBoard[i][j] +  " | ");
      }
      System.out.println();
    }
  }

  public char getCharGameBoard(int first, int second) {
    return gameBoard[first][second];
  }
}
