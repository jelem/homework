package com.hillel.java.tasks.tictactoe;

public abstract class Player {

  private char symbol;
  private String name;

  protected Player(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  void setSymbol(char symbol) {
    this.symbol = symbol;
  }

  public abstract void makeMove(Board board);

  char getSymbol() {
    return symbol;
  }

}
