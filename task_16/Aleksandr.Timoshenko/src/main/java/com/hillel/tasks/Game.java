package com.hillel.tasks;

import java.util.Random;

public class Game implements GameStages {

  Field field;
  Player playerOne;
  Player playerToo;
  private boolean gameNotFinish = true;

  public Game(Player playerOne, Player playerToo) {
    field = new TicTacToeField();
    this.playerOne = playerOne;
    this.playerToo = playerToo;
  }


  @Override
  public void startGame() {
    boolean carentMove = lot(generatNumber());
    field.setCarentMove(carentMove);
    gameLogic();
  }

  private int generatNumber() {
    Random random = new Random();
    return random.nextInt(10);
  }

  public boolean lot(int lotNumber) {
    if (lotNumber % 2 == 0) {
      playerOne.setPlayerChar('X');
      playerToo.setPlayerChar('O');
      return true;
    } else {
      playerOne.setPlayerChar('O');
      playerToo.setPlayerChar('X');
      return false;
    }
  }

  @Override
  public void gameLogic() {
    while (gameFinish()) {
      field.printGameField();
      if (field.isCarentMove()) {
        System.out.println("Player " + playerOne.getName() + " do your move! Chuse case number");
        field.setMovInField(playerOne.getPlayerChar(), playerOne);
        winnerIs(playerOne);
        field.setCarentMove(false);
      } else {
        System.out.println("Player " + playerToo.getName() + " do your move! Chuse case number");
        field.setMovInField(playerToo.getPlayerChar(), playerToo);
        winnerIs(playerToo);
        field.setCarentMove(true);
      }
    }
  }

  @Override
  public boolean gameFinish() {
    if (!field.allFieadFilled()) {
      gameNotFinish = false;
    }
    return gameNotFinish;
  }

  @Override
  public void winnerIs(Player player) {
    gameNotFinish = field.winnerChack(player);
    if (!gameNotFinish) {
      System.out.println("The winner is " + player.getName());
      field.printGameField();
    }
  }
}


