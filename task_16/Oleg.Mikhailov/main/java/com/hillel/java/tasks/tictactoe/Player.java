package com.hillel.java.tasks.tictactoe;

public abstract class Player {

  private char symbol;

  public void setSymbol(char symbol) {
    this.symbol = symbol;
  }

  public abstract void makeMove();

  public char getSymbol() {
    return symbol;
  }

}
