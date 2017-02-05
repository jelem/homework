package com.hillel.java.tasks.tictactoe;

public class Main {

  public static void main(String[] args) {

    Game game = new Game();
    Computer computer = new Computer();
    game.start(computer);

  }
}
