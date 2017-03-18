package com.hillel.tictactoe.mvc;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class ConsoleView implements View, GameObserver {
  private Controller controller;
  private GameState gameState;
  private Board board;

  public ConsoleView(Controller controller, GameState gameState, Board board) {
    this.controller = controller;
    this.gameState = gameState;
    this.board = board;
  }

  private void printCells() {
    System.out.println(".____.____.____.");
    for (int i = 0; i < board.getRows(); i++) {
      for (int j = 0; j < board.getColumns(); j++) {
        System.out.print('|' + "   ");
        printCell(i, j, board.getCellState(i, j));
      }
      System.out.println('|');
      System.out.println(".____.____.____.");
    }
    System.out.println();
  }

  private void printCell(int rowCoord, int colCoord, CellState state) {
    switch (state) {
      case X:
        System.out.print('X');
        break;
      case O:
        System.out.print('O');
        break;
      case EMPTY:
        System.out.print((rowCoord * board.getColumns() + 1) + colCoord + "");
        break;
      default:
        break;
    }
  }

  public void run() throws SQLException, IOException, ClassNotFoundException {
    System.out.println("Game started");
    setNames();
    controller.startGame();
    String symbol = null;
    while (true) {
      if (!gameState.isEndGame()) {
        System.out.println(gameState.getCurrentPlayerName() + " is moving: (q -> quit)");
        symbol = readInput();
        if (symbol.equals("q")) {
          return;
        } else {
          Move move = decodeMove(symbol);
          if (move != null) {
            controller.processUserMove(move);
          }
        }
      } else {
        System.out.println("Would you like to play again?\nr -> restart\nany other key - quit");
        symbol = readInput();
        if (symbol.equals("r")) {
          System.out.println("Game started");
          controller.startGame();
        } else {
          return;
        }
      }
    }
  }

  @Override
  public void setNames() {
    Scanner scanner = new Scanner(System.in, "utf-8");
    for (int playerNumber = 1; playerNumber < 3; playerNumber++) {
      if (controller.isPlayerHuman(playerNumber)) {
        System.out.println("Enter your name, player " + playerNumber);
        String name = scanner.nextLine();
        System.out.println("Enter your surname, player " + playerNumber);
        String surname = scanner.nextLine();
        System.out.println("Enter your nick, player " + playerNumber);
        String nick = scanner.nextLine();
        controller.setNames(playerNumber, name, surname, nick);
      }
    }
  }


  @Override
  public void updateBoard() throws SQLException, IOException, ClassNotFoundException {
    printCells();
    if (gameState.isEndGame()) {
      System.out.print("The game is over. ");
      if (!board.isFull()) {
        System.out.println("The winner is " + gameState.showWinner());
        saveGameInDatabase(gameState.getCurrentPlayerName());
      } else {
        System.out.println("Friendship has won. There are no empty cells anymore");
        saveGameInDatabase(null);
      }
      System.out.println("General count of game moves is " + gameState.getGameMoves());
    }
  }

  private void saveGameInDatabase(String winnerName) throws IOException, SQLException, ClassNotFoundException {
    Properties properties = loadProperties();
    Class.forName("com.mysql.jdbc.Driver");
    Connection connection = DriverManager.getConnection(
        properties.getProperty("url"),
        properties.getProperty("user"),
        properties.getProperty("password"));
    controller.savePlayers(connection);
    controller.saveGame(winnerName, connection);
  }

  public Properties loadProperties() throws IOException {
    try (InputStream inputStream = this.getClass().getResourceAsStream("db.properties")) {
      Properties properties = new Properties();
      properties.load(inputStream);

      return properties;
    }

  }

  @Override
  public void updateTurn() {
    if (!gameState.isEndGame()) {
      System.out.println(gameState.getCurrentPlayerName() + " move (" + gameState.getCurrentPlayerSymbol() + ")");
    }
  }

  private Move decodeMove(String symbol) {
    Move move = null;
    switch (symbol) {
      case "1":
        move = new Move(0, 0);
        break;
      case "2":
        move = new Move(0, 1);
        break;
      case "3":
        move = new Move(0, 2);
        break;
      case "4":
        move = new Move(1, 0);
        break;
      case "5":
        move = new Move(1, 1);
        break;
      case "6":
        move = new Move(1, 2);
        break;
      case "7":
        move = new Move(2, 0);
        break;
      case "8":
        move = new Move(2, 1);
        break;
      case "9":
        move = new Move(2, 2);
        break;
      default:
        System.out.println("Wrong symbol");
    }
    if (move == null || !gameState.isLegalMove(move)) {
      move = null;
    }
    return move;
  }

  private String readInput() {
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8.toString());
    return sc.nextLine();
  }
}
