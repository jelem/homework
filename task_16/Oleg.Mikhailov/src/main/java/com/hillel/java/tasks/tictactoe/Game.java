package com.hillel.java.tasks.tictactoe;

import java.util.Random;
import java.util.Scanner;

class Game {

  private Board board;
  private Player firstHuman;
  private Player secondHuman;
  private Player chosePlayer;
  private Computer computer;
  private String mode;
  Random random = new Random();

  Game(Board board) {
    this.board = board;
    firstHuman = new Human("Oleg");


  }

  private String chooseModeGame() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("One - from people");
    System.out.println("Two - from computer");
    System.out.print("Choose game mode: ");
    String mode = scanner.next();
    return mode;
  }

  void start() {
    mode = chooseModeGame();
    switch (mode) {
      case "One":
        secondHuman = new Human("Max");
        makeSymbolChoseFirst();
        playingProcessPeople();
        break;
      case "Two":
        computer = new Computer("Computer");
        makeSymbolChoseSecond();
        playingProcessComputer();
        break;
      default:
        playingProcessComputer();
        break;
    }
  }


  private void playingProcessPeople() {
    int count = 0;
    while (!endGame() && count != 9) {
      count++;
      makeMove(board);
      board.printBoard();
      if (endGame()) {
        System.out.println(chosePlayer.getName() + " win!");
      }
      changePlayerOne();
    }
  }


  private void playingProcessComputer() {
    int count = 0;

    while (!endGame() && count != 9) {
      count++;
      makeMove(board);
      board.printBoard();
      if (endGame()) {
        System.out.println(chosePlayer.getName() + " win!");
      }
      changePlayerTwo();
    }
  }


  private void changePlayerOne() {
    if (chosePlayer == firstHuman) {
      chosePlayer = secondHuman;
    } else {
      chosePlayer = firstHuman;
    }
  }

  private void changePlayerTwo() {
    if (chosePlayer == firstHuman) {
      chosePlayer = computer;
    } else {
      chosePlayer = firstHuman;
    }
  }

  private void makeMove(Board board) {
    chosePlayer.makeMove(board);
  }

  private boolean endGame() {
    for (int i = 0; i < 3; i++) {
      if (board.getSymbol(0, i) != '\0') {
        if (board.getSymbol(1, i) != '\0') {
          if (board.getSymbol(2, i) != '\0') {
            boolean first = board.getSymbol(0, i) == board.getSymbol(1, i);
            boolean second = board.getSymbol(1, i) == board.getSymbol(2, i);
            if (first == second && first != false) {
              return true;
            }
          }
        }
      }

      if (board.getSymbol(i, 0) != '\0') {
        if (board.getSymbol(i, 1) != '\0') {
          if (board.getSymbol(i, 2) != '\0') {
            boolean first = board.getSymbol(i, 0) == board.getSymbol(i, 1);
            boolean second = board.getSymbol(i, 1) == board.getSymbol(i, 2);
            if (first == second && first != false) {
              return true;
            }
          }
        }
      }

      if (board.getSymbol(0, 0) != '\0') {
        if (board.getSymbol(1, 1) != '\0') {
          if (board.getSymbol(2, 2) != '\0') {
            boolean first = board.getSymbol(0, 0) == board.getSymbol(1, 1);
            boolean second = board.getSymbol(1, 1) == board.getSymbol(2, 2);
            if (first == second && first != false) {
              return true;
            }
          }
        }
      }
      if (board.getSymbol(0, 2) != '\0') {
        if (board.getSymbol(1, 1) != '\0') {
          if (board.getSymbol(2, 0) != '\0') {
            boolean first = board.getSymbol(0, 2) == board.getSymbol(1, 1);
            boolean second = board.getSymbol(1, 1) == board.getSymbol(2, 0);
            if (first == second && first != false) {
              return true;
            }
          }
        }
      }

    }

    return false;

  }

  private void makeSymbolChoseFirst() {
    int choice = random.nextInt(10);
    if (choice >= 5) {
      firstHuman.setSymbol('X');
      secondHuman.setSymbol('O');
      chosePlayer = firstHuman;
    } else {
      firstHuman.setSymbol('O');
      secondHuman.setSymbol('X');
      chosePlayer = secondHuman;
    }
  }

  private void makeSymbolChoseSecond() {
    int choice = random.nextInt(10);
    if (choice >= 5) {
      firstHuman.setSymbol('X');
      computer.setSymbol('O');
      chosePlayer = firstHuman;
    } else {
      firstHuman.setSymbol('O');
      computer.setSymbol('X');
      chosePlayer = computer;
    }
  }

}
