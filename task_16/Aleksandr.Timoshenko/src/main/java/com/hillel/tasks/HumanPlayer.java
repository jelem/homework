package com.hillel.tasks;

public class HumanPlayer implements Player {

  private String name;
  private char playerChar;
  private boolean youAreHuman = true;

  public HumanPlayer(String name) {
    this.name = name;
  }

  @Override
  public void setPlayerChar(char playerChar) {
    this.playerChar = playerChar;
  }


  public String getName() {
    return name;
  }

  public char getPlayerChar() {
    return playerChar;
  }

  public boolean isYouAreHuman() {
    return youAreHuman;
  }
}
