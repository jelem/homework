package com.hillel.tictactoe.mvc;

import java.sql.Connection;
import java.sql.SQLException;

public interface GameState {
  boolean isEndGame();

  String showWinner();

  CellState getCurrentPlayerSymbol();

  String getCurrentPlayerName();

  boolean isLegalMove(Move move);

  String playerType(int number);

  void setPlayerNames(int number, String name, String surname, String nick);

  int getGameMoves();

  void saveGameToDb(String winnerName, Connection connection) throws SQLException;

  void savePlayersToDb(Connection connection) throws SQLException;
}
