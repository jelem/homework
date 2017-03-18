package com.hillel.tictactoe.mvc;

import java.io.IOException;
import java.sql.SQLException;

public interface GameObserver {
  void updateBoard() throws SQLException, IOException, ClassNotFoundException;

  void updateTurn();
}
