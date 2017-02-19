package com.hillel.tasks;


import java.util.Random;

public class BotPlayer implements Player {

  private static String name = "Bot player";
  private char playerChar;
  private boolean youAreHuman = false;

  @Override
  public void setPlayerChar(char playerChar) {
    this.playerChar = playerChar;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public char getPlayerChar() {
    return playerChar;
  }

  public boolean isYouAreHuman() {
    return youAreHuman;
  }

  public static int botMove() {
    Random random = new Random();
    int move = (random.nextInt(3));
    return move;
  }
}
