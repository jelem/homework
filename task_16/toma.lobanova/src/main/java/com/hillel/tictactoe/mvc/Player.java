package com.hillel.tictactoe.mvc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class Player {
  protected static final String UNSET = "unset";
  protected CellState symbol;
  protected String name;
  protected String surname;
  protected String nick;

  public abstract Move makeMove();

  public CellState getPlayerSymbol() {
    return symbol;
  }

  public void setPlayerSymbol(CellState state) {
    symbol = state;
  }

  public abstract boolean needUserMove();

  public void reset() {
  }

  public abstract void setName(String name);

  public abstract void setSurname(String surname);

  public abstract void setNick(String nick);

  public String getNick() {
    return nick;
  }

  public void savePlayerToDb(Connection connection) throws SQLException {
    try (Statement statement = connection.createStatement();
         PreparedStatement preparedStatement = connection.prepareStatement("insert into players "
             + "(name, surname, nick) values (?, ?, ?)")) {
      boolean nickExists = false;
      try (ResultSet resultSet = statement.executeQuery("select nick from players")) {
        String foundNick;
        while (resultSet.next()) {
          foundNick = resultSet.getString("nick");
          if (foundNick.equals(nick)) {
            nickExists = true;
            break;
          }
        }
      }
      if (!nickExists) {

        preparedStatement.setString(1, name);
        preparedStatement.setString(2, surname);
        preparedStatement.setString(3, nick);
        preparedStatement.execute();
      }
    }
  }

  public abstract String getType();

}
