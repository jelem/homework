package dbtictactoe;

public interface Board {

  void fillCell(int row, int column, char symbol);

  char getSymbol(int row, int column);

  void printBoard();


}
