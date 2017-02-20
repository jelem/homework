package com.hillel.tictactoe.mvc;

public class SmartAIPlayer extends AIPlayer {
  private int gameStep = 0;

  public SmartAIPlayer(Board board, AIRandom random) {
    super(board, random);
  }

  private CellState getOpponentSymbol() {
    if (getPlayerSymbol() == CellState.X) {
      return CellState.O;
    } else {
      return CellState.X;
    }
  }

  @Override
  public Move makeMove() {
    Move move = findMoveCompletingLine(getPlayerSymbol());
    if (move != null) {
      return chooseMove(move);
    }
    //don't let the opponent win
    move = findMoveCompletingLine(getOpponentSymbol());
    if (move != null) {
      return chooseMove(move);
    }
    move = makeSmartMove();
    if (move != null) {
      return chooseMove(move);
    }
    move = makeEasyMove();
    return chooseMove(move);
  }

  private Move chooseMove(Move move) {
    gameStep++;
    return move;
  }

  @Override
  public void reset() {
    gameStep = 0;
  }

  private Move makeSmartMove() {
    switch (gameStep) {
      case 0:
        return firstMoveStrategy();
      case 1:
        return secondMoveStrategy();
      case 2:
        return thirdMoveStrategy();
      default:
        break;
    }
    return null;
  }

  private Move xforkStrategy() {
    if (board.getCellState(0, 0) == CellState.X) {
      if (isEmptyCell(0, 1) && isEmptyCell(0, 2)) {
        if (isEmptyCell(2, 0)) {
          return new Move(0, 2);
        }
        if (isEmptyCell(2, 1)) {
          return new Move(0, 1);
        }
      }
    } else {
      if (isEmptyCell(1, 0) && isEmptyCell(2, 0)) {
        if (isEmptyCell(0, 2)) {
          return new Move(2, 0);
        }
        if (isEmptyCell(1, 2)) {
          return new Move(1, 0);
        }
      }
    }
    return null;
  }

  private Move oforkStrategy() {
    if (board.getCellState(0, 2) == CellState.X) {
      if (isEmptyCell(1, 2) && isEmptyCell(2, 2)) {
        if (isEmptyCell(0, 0)) {
          return new Move(2, 2);
        } else {
          if (isEmptyCell(1, 0)) {
            return new Move(1, 2);
          }
        }
      } else {
        if (isEmptyCell(0, 1) && isEmptyCell(0, 0)) {
          if (isEmptyCell(2, 2)) {
            return new Move(0, 0);
          } else if (isEmptyCell(2, 1)) {
            return new Move(0, 1);
          }
        }
      }
    } else {
      if (board.getCellState(2, 2) == CellState.X) {
        if (isEmptyCell(2, 1) && isEmptyCell(2, 0)) {
          if (isEmptyCell(0, 2)) {
            return new Move(2, 0);
          } else if (isEmptyCell(0, 1)) {
            return new Move(2, 1);
          }
        } else if (isEmptyCell(1, 2) && isEmptyCell(0, 2)) {
          if (isEmptyCell(2, 0)) {
            return new Move(0, 2);
          } else if (isEmptyCell(1, 0)) {
            return new Move(1, 2);
          }
        }
      } else {
        if (board.getCellState(2, 0) == CellState.X) {
          if (isEmptyCell(2, 1) && isEmptyCell(2, 0)) {
            if (isEmptyCell(2, 2)) {
              return new Move(0, 0);
            } else if (isEmptyCell(0, 2)) {
              return new Move(1, 0);
            }
          } else if (isEmptyCell(2, 1) && isEmptyCell(2, 2)) {
            if (isEmptyCell(0, 0)) {
              return new Move(2, 2);
            }
            if (isEmptyCell(0, 1)) {
              return new Move(2, 1);
            }
          }
        }
      }
    }
    return null;
  }

  private Move thirdMoveStrategy() {
    //trying to make a fork
    if (getPlayerSymbol() == CellState.X) {
      return xforkStrategy();
    }
    return oforkStrategy();
  }

  private Move secondMoveStrategy() {
    if (getPlayerSymbol() == CellState.X) {
      //if we have occupied the center, we should occupy some corner
      if (getCenterState() == CellState.X) {
        return chooseCorner();
      } else {
        if (getCenterState() == CellState.EMPTY) {
          return chooseCenter();
        } else {
          //if the center is already occupied by the opponent, we should make move to the corner opposite to
          //the corner we've already occupied previously
          return occupyXDiagonalCorners();
        }
      }
    }
    //if center is occupied by AI but diagonal corners belong to the opponent, we need to choose some side center
    if (diagonalCornersAreOccupiedByX()) {
      return chooseSideCenter();
    }
    return null;
  }

  private boolean diagonalCornersAreOccupiedByX() {
    return (board.getCellState(0, 0) == CellState.X && board.getCellState(2, 2) == CellState.X)
        || (board.getCellState(0, 2) == CellState.X && board.getCellState(2, 0)
        == CellState.X);
  }

  private Move occupyXDiagonalCorners() {
    if (board.getCellState(0, 0) == CellState.X) {
      return new Move(2, 2);
    }
    if (board.getCellState(0, 2) == CellState.X) {
      return new Move(2, 0);
    }
    if (board.getCellState(2, 2) == CellState.X) {
      return new Move(0, 0);
    }
    if (board.getCellState(2, 0) == CellState.X) {
      return new Move(0, 2);
    }
    return null;
  }

  Move chooseSideCenter() {
    int sideNumber = rand.getRandomData(4) + 1;
    switch (sideNumber) {
      case 1:
        return new Move(0, 1);
      case 2:
        return new Move(1, 2);
      case 3:
        return new Move(2, 1);
      default:
        return new Move(1, 0);
    }
  }

  private Move firstMoveStrategy() {
    //occupy the center or one of the corners
    if (getPlayerSymbol() == CellState.X) {
      if (rand.getRandomData(2) == 0) {
        return chooseCorner();
      } else {
        return chooseCenter();
      }
    }
    if (getCenterState() == CellState.EMPTY) {
      return chooseCenter();
    } else {
      return chooseCorner();
    }
  }

  private CellState getCenterState() {
    return board.getCellState(1, 1);
  }

  private Move chooseCenter() {
    return new Move(1, 1);
  }

  private Move chooseCorner() {
    int cornerNumber = rand.getRandomData(4) + 1;
    switch (cornerNumber) {
      case 1:
        return new Move(0, 0);
      case 2:
        return new Move(0, 2);
      case 3:
        return new Move(2, 0);
      default:
        return new Move(2, 2);
    }
  }

  private Move findMoveCompletingLine(CellState symbol) {
    int rows = board.getRows();
    int cols = board.getColumns();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (board.getCellState(i, j) == symbol) {
          Move move = tryToCompleteLineByCoordinate(symbol, i, j);
          if (move != null) {
            return move;
          }
        }
      }
    }
    return null;
  }

  private boolean isEmptyCell(int row, int column) {
    return board.getCellState(row, column) == CellState.EMPTY;
  }

  private Move tryToCompleteLineByCoordinate(CellState symbol, int rowCoord, int colCoord) {
    if (rowCoord == 0 && colCoord == 0) {
      if (board.getCellState(1, 0) == symbol
          && isEmptyCell(2, 0)) {

        return new Move(2, 0);
      } else if (isEmptyCell(1, 0)
          && board.getCellState(2, 0) == symbol) {

        return new Move(1, 0);
      } else if (isEmptyCell(1, 1)
          && board.getCellState(2, 2) == symbol) {

        return new Move(1, 1);
      } else if (board.getCellState(1, 1) == symbol
          && isEmptyCell(2, 2)) {

        return new Move(2, 2);
      } else if (board.getCellState(0, 1) == symbol
          && isEmptyCell(0, 2)) {

        return new Move(0, 2);
      } else if (isEmptyCell(0, 1)
          && board.getCellState(0, 2) == symbol) {

        return new Move(0, 1);
      }
    } else if (rowCoord == 0 && colCoord == 1) {
      if (board.getCellState(0, 2) == symbol
          && isEmptyCell(0, 0)) {
        return new Move(0, 0);
      } else if (board.getCellState(1, 1) == symbol
          && isEmptyCell(2, 1)) {

        return new Move(2, 1);
      } else if (isEmptyCell(1, 1)
          && board.getCellState(2, 1) == symbol) {

        return new Move(1, 1);
      }
    } else if (rowCoord == 0 && colCoord == 2) {
      if (board.getCellState(1, 1) == symbol
          && isEmptyCell(2, 0)) {

        return new Move(2, 0);
      } else if (isEmptyCell(1, 1)
          && board.getCellState(2, 0) == symbol) {

        return new Move(1, 1);
      } else if (isEmptyCell(1, 2)
          && board.getCellState(2, 2) == symbol) {

        return new Move(1, 2);
      } else if (board.getCellState(1, 2) == symbol
          && isEmptyCell(2, 2)) {

        return new Move(2, 3);
      }
    } else if (rowCoord == 1 && colCoord == 0) {
      if (board.getCellState(2, 0) == symbol
          && isEmptyCell(0, 0)) {

        return new Move(0, 0);
      } else if (board.getCellState(1, 1) == symbol
          && isEmptyCell(1, 2)) {

        return new Move(1, 2);
      } else if (isEmptyCell(1, 1)
          && board.getCellState(1, 2) == symbol) {

        return new Move(1, 1);
      }
    } else if (rowCoord == 1 && colCoord == 1) {
      if (board.getCellState(2, 0) == symbol
          && isEmptyCell(0, 2)) {

        return new Move(0, 2);
      } else if (board.getCellState(2, 1) == symbol

          && isEmptyCell(0, 1)) {

        return new Move(0, 1);
      } else if (board.getCellState(2, 2) == symbol
          && isEmptyCell(0, 0)) {

        return new Move(0, 0);
      } else if (board.getCellState(1, 2) == symbol
          && isEmptyCell(1, 0)) {

        return new Move(1, 0);
      }
    } else if (rowCoord == 1 && colCoord == 2) {
      if (board.getCellState(2, 2) == symbol
          && isEmptyCell(0, 2)) {

        return new Move(0, 2);
      }
    } else if (rowCoord == 2 && colCoord == 0) {
      if (board.getCellState(2, 1) == symbol
          && isEmptyCell(2, 2)) {

        return new Move(2, 2);
      } else if (isEmptyCell(2, 1)
          && board.getCellState(2, 2) == symbol) {

        return new Move(2, 1);
      }
    } else if (rowCoord == 2 && colCoord == 1) {
      if (board.getCellState(2, 2) == symbol
          && isEmptyCell(2, 0)) {

        return new Move(2, 0);
      }
    }
    return null;
  }
}
