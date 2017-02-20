package com.hillel.homework.tictactoe;


import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsoleReader {
  private static Scanner in = new Scanner(System.in, StandardCharsets.UTF_8.toString());

  public String getInput() {
    return in.nextLine();
  }

  public int getIntInput() {
    return in.nextInt();
  }
}
