package dbtictactoe;


import java.util.Random;

public class HardComplexity implements Complexity {

  Random random = new Random();

  @Override
  public void makeMove(Board board, char symmbolComp) {
    String[] variableMove = new String[]{"00", "02", "20", "22"};
    int row;
    int column;
    char humanChar;
    if (symmbolComp == 'X') {
      humanChar = 'O';
    } else {
      humanChar = 'X';
    }

    if (board.getSymbol(1, 1) == '\0') {
      board.fillCell(1, 1, symmbolComp);
      return;
    }
    if (board.getSymbol(1, 1) == humanChar) {
      int index = 0;
      boolean searchHumanSymbol = true;
      while (searchHumanSymbol) {
        if (index == 4) {
          row = Character.getNumericValue(variableMove[random.nextInt(4)].charAt(0));
          column = Character.getNumericValue(variableMove[random.nextInt(4)].charAt(1));
          board.fillCell(row, column, symmbolComp);
          return;
        }
        row = Character.getNumericValue(variableMove[index].charAt(0));
        column = Character.getNumericValue(variableMove[index].charAt(1));
        index++;
        if (board.getSymbol(row, column) == humanChar) {
          if (row == 2) {
            row = 0;
          } else {
            row = 2;
          }
          if (column == 2) {
            column = 0;
          } else {
            column = 2;
          }
          board.fillCell(row, column, symmbolComp);
          searchHumanSymbol = false;
        }
      }
    } else {
      boolean status = true;
      int step = 0;
      while (status && step < 4) {
        step++;
        int arrayPosition = random.nextInt(4);
        row = Character.getNumericValue(variableMove[arrayPosition].charAt(0));
        column = Character.getNumericValue(variableMove[arrayPosition].charAt(1));
        if (board.getSymbol(row, column) == '\0') {
          board.fillCell(row, column, symmbolComp);
          status = false;
        }
      }

    }
  }

}

