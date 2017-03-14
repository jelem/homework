package dbtictactoe;

import java.io.IOException;

public abstract class Player {

  private char symbol;
  private String name;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  void setSymbol(char symbol) {
    this.symbol = symbol;
  }

  public abstract void makeMove(Board board) throws IOException;

  char getSymbol() {
    return symbol;
  }

}
