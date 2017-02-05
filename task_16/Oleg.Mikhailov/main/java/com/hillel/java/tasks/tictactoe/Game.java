package com.hillel.java.tasks.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Game {

  Scanner scanner = new Scanner(System.in);
  Board board;
  Player human;
  Player computer;
  Player chosePlayer;
  Player winner;
   private String complexity;

  public Game() {
    board = new TicTacToeBoard();
    human = new Human("Oleg");
    computer = new Computer();
    makeSymbolChose();
  }

  public void start(Computer computer) {
    playingProcess(computer);
  }

  private void playingProcess(Computer computer) {
    complexity = Computer.choseComplexity();
    int count = 0;

    while (!endGame(count)) {
      count++;
      makeMove();
      board.printBoard();
      changePlayer();

    }
    if (count == 10) {
      System.out.println("Draw!");
    }

  }

  private void changePlayer() {
    if (chosePlayer == human) {
      chosePlayer = computer;
    } else {
      chosePlayer = human;
    }
  }

  private void makeMove() {
    chosePlayer.makeMove();
  }

  private boolean endGame(int count) {
    if (count == 10) {
      return true;
    }
    // todo метод для проверки комбинации выигрыша

    return false;

  }


  private void makeSymbolChose() {
    Random random = new Random();
    int choice = random.nextInt(10);
    if (choice >= 5) {
      human.setSymbol('X');
      computer.setSymbol('O');
      chosePlayer = human;
    } else {
      human.setSymbol('O');
      computer.setSymbol('X');
      chosePlayer = computer;
    }
  }

  public String getComplexity() {
    return complexity;
  }
}
