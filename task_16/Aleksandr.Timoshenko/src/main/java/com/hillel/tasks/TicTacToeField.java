package com.hillel.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TicTacToeField extends Field {

  private Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.toString());

  private char[][] field = new char[3][3];
  private boolean currentMove;
  private String caseNumber;
  private int currentI;
  private int currentJ;

  public TicTacToeField() {
    initField();
  }

  @Override
  public void initField() {

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        field[i][j] = ' ';
      }
    }
  }

  @Override
  void printGameField() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(field[i][j] + "|");
      }
      System.out.println();
    }
  }

  public void setMovInField(char playerChar, Player player) {
    if (player.isYouAreHuman()) {
      caseNumber = scanner.nextLine();
      currentI = Character.getNumericValue(caseNumber.charAt(0));
      currentJ = Character.getNumericValue(caseNumber.charAt(1));
      if (currentI >= 0 & currentI <= 2 & currentJ >= 0 & currentJ <= 2) {
        if (field[currentI][currentJ] == ' ') {
          field[currentI][currentJ] = playerChar;

        } else {
          System.out.println("This already contains a character, try again");
          setMovInField(playerChar, player);
        }
      } else {
        System.out.println("This field does not exist, try again");
        setMovInField(playerChar, player);
      }
    } else {
      currentI = BotPlayer.botMove();
      currentJ = BotPlayer.botMove();
      if (field[currentI][currentJ] == ' ') {
        field[currentI][currentJ] = playerChar;
      } else {
        setMovInField(playerChar, player);
      }
    }
  }

  @Override
  public void setCarentMove(boolean carentMove) {
    this.currentMove = carentMove;
  }

  @Override
  public boolean isCarentMove() {
    return currentMove;
  }

  @Override
  public boolean winnerChack(Player player) {
    int sum = 0;
    for (int k = 0; k < 3; k++) {
      if (field[currentI][k] == player.getPlayerChar()) {
        sum++;
        if (sum == 3) {
          return false;
        }
      } else {
        break;
      }
    }
    sum = 0;
    for (int k = 0; k < 3; k++) {
      if (field[k][currentI] == player.getPlayerChar()) {
        sum++;
        if (sum == 3) {
          return false;
        }
      } else {
        break;
      }
    }
    sum = 0;
    for (int k = 0; k < 3; k++) {
      if (field[k][k] == player.getPlayerChar()) {
        sum++;
        if (sum == 3) {
          return false;
        }
      } else {
        break;
      }
    }
    sum = 0;
    for (int k = 0, z = 2; k < 3; k++, z--) {
      if (field[k][z] == player.getPlayerChar()) {
        sum++;
        if (sum == 3) {
          return false;
        }
      } else {
        break;
      }
    }
    return true;
  }

  @Override
  public boolean allFieadFilled() {
    int countEmptyField = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (field[i][j] == ' ') {
          countEmptyField++;
        }
      }
    }
    if (countEmptyField > 0) {
      System.out.println("No more empty fields");
      return true;
    }
    return false;
  }
}

