package com.hillel.homework.tictactoe;


import java.util.Random;

public class DifficultyEasy implements Difficulty {

  private Random random = new Random();

  @Override
  public void playerMove(Board board, Field symbol) {
    boolean status = true;
    while (status) {
      int row = random.nextInt(3);
      int col = random.nextInt(3);
      if (board.cells[row][col].content == Field.EMPTY) {
        board.cells[row][col].content = symbol;
        System.out.println("Computer turn :");
        status = false;
      } else {
        status = true;
      }
    }
  }
}

