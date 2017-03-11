package com.hillel.tictactoe.mvc;

import java.io.IOException;
import java.sql.SQLException;

public interface View {
  void run() throws SQLException, IOException, ClassNotFoundException;

  void setNames();
}
