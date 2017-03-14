package dbtictactoe;

import java.util.Random;

public class EasyComplexity implements Complexity {

  private Random random = new Random();

  @Override
  public void makeMove(Board board, char symbolComp) {
    boolean status = true;
    while (status) {
      int row = random.nextInt(3);
      int column = random.nextInt(3);
      if (board.getSymbol(row, column) == '\0') {
        System.out.println("Computer move");
        board.fillCell(row, column, symbolComp);
        status = false;
      } else {
        status = true;
      }
    }
  }

}
