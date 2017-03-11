package com.hillel.tictactoe.mvc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class Game implements GameState {
  private Player playerFirst;
  private Player playerSecond;
  private Player currentPlayer;
  private Board board;
  GameObserver observer;
  private int gameMoves;

  public Game(Board board, Player playerFirst, Player playerSecond) {
    this.playerFirst = playerFirst;
    this.playerSecond = playerSecond;
    this.board = board;
    gameMoves = 0;
  }

  public int getGameMoves() {
    return gameMoves;
  }

  @Override
  public void saveGameToDb(String winnerName, Connection connection) throws SQLException {
    try (PreparedStatement preparedStatementFirst = connection.prepareStatement("select * from players where "
        + "nick = ?");
         PreparedStatement preparedStatementSecond = connection.prepareStatement("insert into games "
             + "(first_player_id, second_player_id, winner_id, moves) values (?, ?, ?, ?)")) {
      final int firstPlayerId = getPlayerId(playerFirst, preparedStatementFirst);
      final int secondPlayerId = getPlayerId(playerSecond, preparedStatementFirst);
      int winnerId = 0;
      if (winnerName != null) {
        winnerId = getPlayerId(currentPlayer, preparedStatementFirst);
      }

      preparedStatementSecond.setString(1, firstPlayerId + "");
      preparedStatementSecond.setString(2, secondPlayerId + "");
      if (winnerId != 0) {
        preparedStatementSecond.setString(3, winnerId + "");
      } else {
        preparedStatementSecond.setString(3, null);
      }
      preparedStatementSecond.setString(4, gameMoves + "");
      preparedStatementSecond.execute();
    }
  }

  private int getPlayerId(Player player, PreparedStatement preparedStatement) throws SQLException {
    preparedStatement.setString(1, player.getNick());
    try (ResultSet resultSet = preparedStatement.executeQuery()) {
      int id = 0;
      if (resultSet.next()) {
        id = resultSet.getInt("id");
      }
      return id;
    }
  }

  @Override
  public void savePlayersToDb(Connection connection) throws SQLException {
    if (playerFirst.getType().equals("human")) {
      playerFirst.savePlayerToDb(connection);
    }
    if (playerSecond.getType().equals("human")) {
      playerFirst.savePlayerToDb(connection);
    }
  }

  void registerObserver(GameObserver observer) {
    this.observer = observer;
  }

  private void whoPlaysFirst() {
    Random rand = new Random();
    int number = rand.nextInt(2);
    if (number == 0) {
      currentPlayer = playerFirst;
      playerSecond.setPlayerSymbol(CellState.O);
    } else {
      currentPlayer = playerSecond;
      playerFirst.setPlayerSymbol(CellState.O);
    }
    currentPlayer.setPlayerSymbol(CellState.X);
  }

  public void start() throws SQLException, IOException, ClassNotFoundException {
    board.reset();
    playerFirst.reset();
    playerSecond.reset();
    gameMoves = 0;
    whoPlaysFirst();
    observer.updateBoard();
    observer.updateTurn();
    while (!needUserMove()) {
      Move move = currentPlayer.makeMove();
      gameMoves++;
      board.markCell(move.getRowCoordinate(), move.getColumnCoordinate(), currentPlayer.getPlayerSymbol());
      observer.updateBoard();
      changePlayer();
      observer.updateTurn();
    }
  }

  @Override
  public boolean isEndGame() {
    return board.isEndGame(currentPlayer.getPlayerSymbol());
  }

  @Override
  public String showWinner() {
    return currentPlayer.getNick();
  }

  private boolean needUserMove() {
    return currentPlayer.needUserMove();
  }

  public void updateGameState() throws SQLException, IOException, ClassNotFoundException {
    do {
      Move move = currentPlayer.makeMove();
      gameMoves++;
      board.markCell(move.getRowCoordinate(), move.getColumnCoordinate(), currentPlayer.getPlayerSymbol());
      observer.updateBoard();
      if (isEndGame()) {
        break;
      }
      changePlayer();
      observer.updateTurn();
    }
    while (!needUserMove());
  }

  private void changePlayer() {
    if (currentPlayer == playerFirst) {
      currentPlayer = playerSecond;
    } else {
      currentPlayer = playerFirst;
    }
  }

  @Override
  public CellState getCurrentPlayerSymbol() {
    return currentPlayer.getPlayerSymbol();
  }

  @Override
  public String getCurrentPlayerName() {
    return currentPlayer.getNick();
  }

  @Override
  public boolean isLegalMove(Move move) {
    return board.getCellState(move.getRowCoordinate(), move.getColumnCoordinate()) == CellState.EMPTY;
  }

  @Override
  public String playerType(int number) {
    if (number == 1) {
      return playerFirst.getType();
    } else {
      return playerSecond.getType();
    }
  }

  @Override
  public void setPlayerNames(int number, String name, String surname, String nick) {
    if (number == 1) {
      playerFirst.setName(name);
      playerFirst.setSurname(surname);
      playerFirst.setNick(nick);
    } else {
      playerSecond.setName(name);
      playerSecond.setSurname(surname);
      playerSecond.setNick(nick);
    }
  }
}
