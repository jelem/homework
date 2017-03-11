package com.hillel.tictactoe.mvc;

public class HumanPlayer extends Player {
  private UserMove userMove;

  public void setName(String name) {
    if (name != null) {
      this.name = name;
    } else {
      this.name = UNSET;
    }
  }

  public void setSurname(String surname) {
    if (name != null) {
      this.surname = surname;
    } else {
      this.surname = UNSET;
    }
  }

  public void setNick(String nick) {
    if (nick != null) {
      this.nick = nick;
    } else {
      this.nick = UNSET;
    }
  }

  @Override
  public String getType() {
    return "human";
  }

  public HumanPlayer(UserMove userMove) {
    this.userMove = userMove;
  }

  public boolean needUserMove() {
    return true;
  }

  public Move makeMove() {
    return userMove.getMove();
  }

}
