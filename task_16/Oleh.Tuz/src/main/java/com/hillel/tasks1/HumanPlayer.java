package com.hillel.tasks1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by TUZ on 12.02.2017.
 */
public class HumanPlayer implements Player {
  private String firstName;
  private String lastName;
  private int age;
  private char symbol;
  private ConsoleReader consoleReader;


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getSymbol() {
    return symbol;
  }

  @Override
  public String makeMove() {

    String move = consoleReader.getData();

    if (!validateMove(move)) {
      throw new MoveNotValidException("Move not valid");
    }
    return move;
  }

  private boolean validateMove(String move) {

    if (move.length() != 2) {
      return false;
    }
    int row = move.charAt(0) - 48;
    int column = move.charAt(1) - 48;
    boolean result = false;


    if (row >= 0 && row <= 2) {
      result = true;
    } else {
      result = false;
    }
    if (column >= 0 && column <= 2) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }

  public void setSymbol(char symbol) {

    this.symbol = symbol;
  }

  public static class Builder {
    private String firstName;
    private String lastName;
    private int age;
    private char symbol;
    private ConsoleReader consoleReader;

    public void firstName(String firstName) {
      this.firstName = firstName;
    }

    public void lastName(String lastName) {
      this.lastName = lastName;
    }

    public void symbol(char symbol) {
      this.symbol = symbol;
    }

    public void consoleReader(ConsoleReaderImpl consoleReader) {
      this.consoleReader = consoleReader;
    }

    public HumanPlayer build() {
      HumanPlayer humanPlayer = new HumanPlayer(this);
      return humanPlayer;
    }


  }

  private HumanPlayer(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.symbol = builder.symbol;
    this.consoleReader = builder.consoleReader;
  }

}
