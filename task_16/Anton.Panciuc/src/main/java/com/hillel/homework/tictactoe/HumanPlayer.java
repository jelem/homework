package com.hillel.homework.tictactoe;


public class HumanPlayer extends Player {

  private ConsoleReader reader;

  public HumanPlayer(String name) {
    this.name = name;
  }

  public void playerMove(Board board) {
    reader = new ConsoleReader();
    boolean validInput = false;
    do {
      System.out.print("Player " + getName() + " enter your move 1-3 row then column : ");

      int row = reader.getIntInput() - 1;
      int col = reader.getIntInput() - 1;
      if (validInput(row, col)
          && ableToMakeMove(board.cells[row][col])) {
        board.cells[row][col].content = getSymbol();
        validInput = true;
      } else {
        System.out.println("This move at (" + (row + 1) + "," + (col + 1)
            + ") is not valid. Try again...");
      }
    }
    while (!validInput);
  }

  private boolean ableToMakeMove(Cell cell) {
    return cell.content == Field.EMPTY;
  }

  private boolean validInput(int row, int col) {
    return row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS;
  }
}
