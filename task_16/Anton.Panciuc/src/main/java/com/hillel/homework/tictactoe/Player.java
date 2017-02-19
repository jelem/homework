package com.hillel.homework.tictactoe;

public abstract class Player {
  String name;
  Field playerSymbol;

  public void setSymbol(Field symbol) {
    this.playerSymbol = symbol;
  }

  public Field getSymbol() {
    return playerSymbol;
  }

  public String getName() {
    return name;
  }

  public abstract void playerMove(Board board);

}
