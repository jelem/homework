package com.hillel.java.tasks.tictactoe;


import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    Board board = new TicTacToeBoard();
    Game game = new Game(board);
    game.start();

  }
}
