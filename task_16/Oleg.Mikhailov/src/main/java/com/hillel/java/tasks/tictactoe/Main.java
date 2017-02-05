package com.hillel.java.tasks.tictactoe;


public class Main {

  public static void main(String[] args) {

    Board board = new TicTacToeBoard();
    Game game = new Game(board);
    game.start();

  }
}
