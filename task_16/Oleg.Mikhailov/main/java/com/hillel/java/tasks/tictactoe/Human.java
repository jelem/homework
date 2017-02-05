package com.hillel.java.tasks.tictactoe;

import java.util.Scanner;

public class Human extends Player {

  String name;
  TicTacToeBoard board = new TicTacToeBoard();


  public Human(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


  @Override
  public void makeMove() {
    System.out.print("Make your move " + getName() + ": ");
    Scanner scanner = new Scanner(System.in);
    String move = scanner.next();
    int row = Character.getNumericValue(move.charAt(0));
    int column = Character.getNumericValue(move.charAt(1));
    char humanChar = getSymbol();
    board.fillCell(row, column, humanChar);

  }

}
