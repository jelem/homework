package com.hillel.java.tasks.tictactoe;

import java.util.Scanner;

public class Human extends Player {

  private Scanner scanner = new Scanner(System.in);

  private String name;

  Human(String name) {
    super(name);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void makeMove(Board board) {
    System.out.print("Make your move " + getName() + ": ");
    String move = scanner.next();
    if (move.length() < 2) {
      System.out.println("Incorrect input");
      makeMove(board);
      return;
    }
    int row = Character.getNumericValue(move.charAt(0));
    int column = Character.getNumericValue(move.charAt(1));
    if (board.getSymbol(row, column) == '\0') {
      board.fillCell(row, column, getSymbol());
    } else {
      System.out.println("Cell is not empty! Choose another.");
      makeMove(board);
    }

  }

}
