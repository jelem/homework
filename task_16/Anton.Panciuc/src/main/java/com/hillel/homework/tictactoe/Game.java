package com.hillel.homework.tictactoe;


import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Game {
  private Board board;
  private GameState currentState;
  private Player playerSecond;
  private Player playerFirst;
  private Player currentPlayer;

  private static Scanner in = new Scanner(System.in, StandardCharsets.UTF_8.toString());

  private Random random = new Random();

  public Game() {
    board = new BoardTicTacToe();


    initGame();

    do {
      playerMove(board);
      board.paint();
      updateGame(currentPlayer);
      if (currentState == GameState.CROSS_WIN) {
        System.out.println("'X' won! Game over.");
      } else if (currentState == GameState.ZERO_WIN) {
        System.out.println("'O' won! Game over.");
      } else if (currentState == GameState.DRAW) {
        System.out.println("It's Draw! Game over.");
      }
      currentPlayer = (currentPlayer == playerFirst) ? playerSecond : playerFirst;
    }
    while (currentState == GameState.PLAYING);
  }


  public void initGame() {
    board.init();
    if (gameMode().equals("Two")) {
      System.out.println("Enter first player name");
      playerFirst = new HumanPlayer(in.nextLine());
      randomFieldSymbol(playerFirst);
      System.out.println("Enter second player name");
      playerSecond = new HumanPlayer(in.nextLine());
      randomFieldSymbol(playerSecond);
      currentPlayer = randomPlayer();
      currentState = GameState.PLAYING;
    } else {
      if (gameDifficulty().equals("Easy")) {
        currentState = GameState.PLAYING;
        System.out.println("Enter player name");
        playerFirst = new HumanPlayer(in.nextLine());
        randomFieldSymbol(playerFirst);
        Difficulty difficulty = new DifficultyEasy();
        playerSecond = new AiPlayer(difficulty);
        randomFieldSymbol(playerSecond);
        currentPlayer = randomPlayer();
      } else {
        currentState = GameState.PLAYING;
        System.out.println("Enter player name");
        playerFirst = new HumanPlayer(in.nextLine());
        playerFirst.setSymbol(Field.ZERO);
        Difficulty difficulty = new DifficultyHard();
        playerSecond = new AiPlayer(difficulty);
        playerSecond.setSymbol(Field.CROSS);
        currentPlayer = randomPlayer();
      }
    }
  }

  private String gameDifficulty() {
    System.out.println("Chose game mode Easy or Hard :");
    return in.nextLine();
  }

  private Player randomPlayer() {
    final int rnd = random.nextInt(2);
    if (rnd == 0) {
      return playerFirst;
    } else {
      return playerSecond;
    }
  }

  private void randomFieldSymbol(Player player) {
    if (player.equals(playerSecond)) {
      if (playerFirst.getSymbol().equals(Field.CROSS)) {
        player.setSymbol(Field.ZERO);
      } else {
        player.setSymbol(Field.CROSS);
      }
      return;
    }

    final int rnd = random.nextInt(2);
    if (rnd == 0) {
      player.setSymbol(Field.CROSS);
    } else {
      player.setSymbol(Field.ZERO);
    }
  }

  private static String gameMode() {
    System.out.println("How many players One or Two: ");
    return in.nextLine();
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
