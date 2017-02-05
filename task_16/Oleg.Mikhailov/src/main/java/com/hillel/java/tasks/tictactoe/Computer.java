package com.hillel.java.tasks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {

  private String name;
  private Random random = new Random();

  Computer(String name) throws IOException {
    super(name);
    this.name = name;
  }


  private String complexity = choseComplexity();

  private static String choseComplexity() throws IOException {
    System.out.print("Input complexity of game (Easy/Hard): ");
    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
    String complexity = scanner.readLine();
    return complexity;
  }

  @Override
  public void makeMove(Board board) {
    switch (complexity) {
      case "Easy":
        System.out.println("Move from computer");
        easyMoveComputer(board);
        break;

      case "Hard":
        //todo Дополнить
        System.out.println("Move from computer");
        hardMoveComputer(board);
        break;
      default:
        System.out.println("You input incorrect complexity. Default - Easy mod.");
        easyMoveComputer(board);
        break;
    }

  }


  private void easyMoveComputer(Board board) {
    boolean status = true;
    while (status) {
      int row = random.nextInt(3);
      int column = random.nextInt(3);
      if (board.getSymbol(row, column) == '\0') {
        board.fillCell(row, column, getSymbol());
        status = false;
      } else {
        status = true;
      }
    }
  }

  private void hardMoveComputer(Board board) {
    String[] variableMove = new String[]{"00", "02", "20", "22"};
    int row;
    int column;
    char humanChar;
    if (getSymbol() == 'X') {
      humanChar = 'O';
    } else {
      humanChar = 'X';
    }

    if (board.getSymbol(1, 1) == '\0') {
      board.fillCell(1, 1, getSymbol());
      return;
    }
    if (board.getSymbol(1, 1) == humanChar) {
      int index = 0;
      boolean searchHumanSymbol = true;
      while (searchHumanSymbol) {
        if (index == 4) {
          row = Character.getNumericValue(variableMove[random.nextInt(4)].charAt(0));
          column = Character.getNumericValue(variableMove[random.nextInt(4)].charAt(1));
          board.fillCell(row, column, getSymbol());
          return;
        }
        row = Character.getNumericValue(variableMove[index].charAt(0));
        column = Character.getNumericValue(variableMove[index].charAt(1));
        index++;
        if (board.getSymbol(row, column) == humanChar) {
          if (row == 2) {
            row = 0;
          } else {
            row = 2;
          }
          if (column == 2) {
            column = 0;
          } else {
            column = 2;
          }
          board.fillCell(row, column, getSymbol());
          searchHumanSymbol = false;
        }
      }
    } else {
      boolean status = true;
      int step = 0;
      while (status && step < 4) {
        step++;
        int arrayPosition = random.nextInt(4);
        row = Character.getNumericValue(variableMove[arrayPosition].charAt(0));
        column = Character.getNumericValue(variableMove[arrayPosition].charAt(1));
        if (board.getSymbol(row, column) == '\0') {
          board.fillCell(row, column, getSymbol());
          status = false;
        }
      }

    }
  }


  @Override
  public String getName() {
    return name;
  }
}
