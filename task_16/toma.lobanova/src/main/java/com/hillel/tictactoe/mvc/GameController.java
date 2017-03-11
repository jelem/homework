package com.hillel.tictactoe.mvc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class GameController implements Controller {
  private Game game;
  private UserMove userMove;

  GameController(Game game, UserMove userMove) {
    this.game = game;
    this.userMove = userMove;
  }

  public void startGame() throws SQLException, IOException, ClassNotFoundException {
    game.start();
  }

  public void processUserMove(Move move) throws SQLException, IOException, ClassNotFoundException {
    userMove.setMove(move);
    game.updateGameState();
  }

  @Override
  public void setNames(int number, String name, String surname, String nick) {
    game.setPlayerNames(number, name, surname, nick);
  }

  @Override
  public boolean isPlayerHuman(int playerNumber) {
    return game.playerType(playerNumber).equals("human");
  }

  @Override
  public void saveGame(String winner, Connection connection) throws SQLException {
    game.saveGameToDb(winner, connection);
  }

  @Override
  public void savePlayers(Connection connection) throws SQLException {
    game.savePlayersToDb(connection);
  }
}
