package com.hillel.tictactoe.mvc;

import java.util.Random;

public class Game implements GameState {
  private Player playerFirst;
  private Player playerSecond;
  private Player currentPlayer;
  private Board board;
  GameObserver observer;

  public Game(Board board, Player playerFirst, Player playerSecond) {
    this.playerFirst = playerFirst;
    this.playerSecond = playerSecond;
    this.board = board;
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

  public void start() {
    board.reset();
    playerFirst.reset();
    playerSecond.reset();
    whoPlaysFirst();
    observer.updateBoard();
    observer.updateTurn();
    while (!needUserMove()) {
      Move move = currentPlayer.makeMove();
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
    return currentPlayer.getName();
  }

  private boolean needUserMove() {
    return currentPlayer.needUserMove();
  }

  public void updateGameState() {
    do {
      Move move = currentPlayer.makeMove();
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
    return currentPlayer.getName();
  }

  @Override
  public boolean isLegalMove(Move move) {
    return board.getCellState(move.getRowCoordinate(), move.getColumnCoordinate()) == CellState.EMPTY;
  }
}
