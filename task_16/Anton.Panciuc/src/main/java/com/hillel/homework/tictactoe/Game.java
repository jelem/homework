package com.hillel.homework.tictactoe;

import java.util.Random;

public class Game {
  private Board board;
  private GameState currentState;
  private Player playerSecond;
  private Player playerFirst;
  private Player currentPlayer;


  private Random random = new Random();

  public Game(Player playerSecond) {
    board = new BoardTicTacToe();
    playerFirst = new HumanPlayer("Host");
    this.playerSecond = playerSecond;

    initGame();

    do {
      playerMove(board);
      board.paint();
      updateGame(currentPlayer);
      printGameState();
      changePlayer();
    }
    while (currentState == GameState.PLAYING);
  }

  private void changePlayer() {
    currentPlayer = (currentPlayer == playerFirst) ? playerSecond : playerFirst;
  }

  private void printGameState() {
    if (currentState == GameState.CROSS_WIN) {
      System.out.println("'X' won! Game over.");
    } else if (currentState == GameState.ZERO_WIN) {
      System.out.println("'O' won! Game over.");
    } else if (currentState == GameState.DRAW) {
      System.out.println("It's Draw! Game over.");
    }
  }

  public void initGame() {
    board.init();
    currentState = GameState.PLAYING;
    currentPlayer = randomPlayer();
    randomFieldSymbol();
  }

  private Player randomPlayer() {
    final int rnd = random.nextInt(2);
    if (rnd == 0) {
      return playerFirst;
    } else {
      return playerSecond;
    }
  }

  private void randomFieldSymbol() {
    if (playerSecond.getSymbol() == null) {
      final int rnd = random.nextInt(2);
      if (rnd == 0) {
        playerSecond.setSymbol(Field.CROSS);
      } else {
        playerSecond.setSymbol(Field.ZERO);
      }
    }

    if (playerSecond.getSymbol().equals(Field.CROSS)) {
      playerFirst.setSymbol(Field.ZERO);
    } else {
      playerFirst.setSymbol(Field.CROSS);
    }
  }

  private void playerMove(Board board) {
    currentPlayer.playerMove(board);
  }

  private void updateGame(Player player) {
    Field theField = player.getSymbol();
    if (board.hasWon(theField)) {
      currentState = (theField == Field.CROSS) ? GameState.CROSS_WIN : GameState.ZERO_WIN;
    } else if (board.isDraw()) {
      currentState = GameState.DRAW;
    }

  }

}
