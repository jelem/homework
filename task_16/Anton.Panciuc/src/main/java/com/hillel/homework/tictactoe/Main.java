package com.hillel.homework.tictactoe;

public class Main {
  public static void main(String[] args) {
    Player playerSecond;
    playerSecond = createPlayer();
    Game game = new Game(playerSecond);
    game.initGame();
  }

  static Player createPlayer() {
    PlayerFactory factory = new PlayerFactory();
    return factory.createCurrentPlayer();
  }
}

