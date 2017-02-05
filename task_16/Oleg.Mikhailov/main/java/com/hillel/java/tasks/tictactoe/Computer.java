package com.hillel.java.tasks.tictactoe;


import java.util.Scanner;

public class Computer extends Player {

  TicTacToeBoard board = new TicTacToeBoard();

  public static String choseComplexity() {
    System.out.print("Input complexity of game: ");
    Scanner scanner = new Scanner(System.in);
    String result = scanner.next();
    return result;
  }

  @Override
  public void makeMove() {
    //todo доделать получение сложности
    String complexity = "Easy"/*game.getComplexity()*/;
    switch (complexity) {
      case "Easy":
        System.out.println("Move from computer");
        easyMoveComputer();
        break;

      case "Hard":
        System.out.println("Move from computer");
        hardMoveComputer();
        break;
    }

  }


  private void easyMoveComputer() {
    int from = 0;
    int before = 3;
    int row = from + (int)(Math.random()*before);
    int column = from + (int)(Math.random()*before);
    boolean status = true;
    while (status) {
      if (board.getCharGameBoard(row, column) == '\0') {
        row = from + (int) (Math.random() * before);
        column = from + (int) (Math.random() * before);
        board.fillCell(row, column, getSymbol());
        status = false;
      } else {
        status =true;
      }
    }
  }

  private void hardMoveComputer() {
  }
}
