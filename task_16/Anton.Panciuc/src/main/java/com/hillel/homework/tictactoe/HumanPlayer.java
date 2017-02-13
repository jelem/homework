package com.hillel.homework.tictactoe;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HumanPlayer extends Player {

  private static Scanner in = new Scanner(System.in, StandardCharsets.UTF_8.toString());

  public HumanPlayer(String name) {
    this.name = name;
  }

  public void playerMove(Board board) {
    boolean validInput = false;
    do {
      System.out.print("Player " + getName() + " enter your move 1-3 row then column : ");

      int row = in.nextInt() - 1;
      int col = in.nextInt() - 1;
      if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
          && board.cells[row][col].content == Field.EMPTY) {
        board.cells[row][col].content = getSymbol();
        validInput = true;
      } else {
        System.out.println("This move at (" + (row + 1) + "," + (col + 1)
            + ") is not valid. Try again...");
      }
    }
    while (!validInput);
  }
}
