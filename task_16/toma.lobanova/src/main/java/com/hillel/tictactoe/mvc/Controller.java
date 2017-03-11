package com.hillel.tictactoe.mvc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public interface Controller {
  void startGame() throws SQLException, IOException, ClassNotFoundException;

  void processUserMove(Move move) throws SQLException, IOException, ClassNotFoundException;

  void setNames(int number, String name, String surname, String nick);

  boolean isPlayerHuman(int playerNumber);

  void saveGame(String winnerName, Connection connection) throws SQLException;

  void savePlayers(Connection connection) throws SQLException;
}
