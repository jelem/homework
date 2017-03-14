package dbtictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Human extends Player {

  BufferedReader scanner = new BufferedReader(
      new InputStreamReader(System.in, StandardCharsets.UTF_8));

  private String name;

  Human(String name) {
    super("Oleg");
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void makeMove(Board board) throws IOException {
    System.out.print("Make your move " + getName() + ": ");
    String move = scanner.readLine();
    if (move == null) {
      return;
    }
    if (move.length() < 2) {
      System.out.println("Incorrect input");
      makeMove(board);
      return;
    }
    int row = Character.getNumericValue(move.charAt(0));
    int column = Character.getNumericValue(move.charAt(1));
    if (board.getSymbol(row, column) == '\0') {
      board.fillCell(row, column, getSymbol());
    } else {
      System.out.println("Cell is not empty! Choose another.");
      makeMove(board);
    }

  }

}
