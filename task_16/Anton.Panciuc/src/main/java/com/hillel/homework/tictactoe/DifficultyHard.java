package com.hillel.homework.tictactoe;


import java.util.ArrayList;
import java.util.List;

public class DifficultyHard implements Difficulty {
  private Board board;
  Cell aiMove;

  @Override
  public void playerMove(Board board, Field symbol) {
    this.board = board;
    minimax(symbol, 0);
    board.cells[aiMove.row][aiMove.col].content = symbol;
    System.out.println("Computer turn :");
  }


  private int minimax(Field symbol, int depth) {
    if (board.hasWon(Field.CROSS)) {
      return +1;
    }
    if (board.hasWon(Field.ZERO)) {
      return -1;
    }

    List<Cell> pointsAvailable = getAvailableStates();
    if (pointsAvailable.isEmpty()) {
      return 0;
    }

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < pointsAvailable.size(); ++i) {
      Cell point = pointsAvailable.get(i);
      if (symbol == Field.CROSS) {
        minimaxMove(point, Field.CROSS);
        int currentScore = minimax(Field.ZERO, depth + 1);
        max = Math.max(currentScore, max);

        if (currentScore >= 0) {
          if (depth == 0) {
            aiMove = point;
          }
        }
        if (currentScore == 1) {
          board.cells[point.row][point.col].content = Field.EMPTY;
          break;
        }
        if (i == pointsAvailable.size() - 1 && max < 0) {
          if (depth == 0) {
            aiMove = point;
          }
        }
      } else if (symbol == Field.ZERO) {
        minimaxMove(point, Field.ZERO);
        int currentScore = minimax(Field.CROSS, depth + 1);
        min = Math.min(currentScore, min);
        if (min == -1) {
          board.cells[point.row][point.col].content = Field.EMPTY;
          break;
        }
      }
      board.cells[point.row][point.col].content = Field.EMPTY;
    }
    return symbol == Field.CROSS ? max : min;
  }

  List<Cell> availablePoints;

  public List<Cell> getAvailableStates() {
    availablePoints = new ArrayList<>();
    for (int row = 0; row < 3; ++row) {
      for (int col = 0; col < 3; ++col) {
        if (board.cells[row][col].content.equals(Field.EMPTY)) {
          availablePoints.add(new Cell(row, col));
        }
      }
    }
    return availablePoints;
  }

  public void minimaxMove(Cell point, Field symbol) {
    board.cells[point.row][point.col].content = symbol;
  }

}
