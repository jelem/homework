package com.hillel.tictactoe.mvc;

public class GameController implements Controller {
  private Game game;
  private UserMove userMove;

  GameController(Game game, UserMove userMove) {
    this.game = game;
    this.userMove = userMove;
  }

  public void startGame() {
    game.start();
  }

  public void processUserMove(Move move) {
    userMove.setMove(move);
    game.updateGameState();
  }
}
