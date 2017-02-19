package com.hillel.tasks;


public class Main {

  public static void main(String[] args) {
    Player playerOne = new HumanPlayer("Denis");
    Player playerToo = new BotPlayer();
    Game game = new Game(playerOne, playerToo);
    game.startGame();
  }

}
