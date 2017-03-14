package dbtictactoe;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc {

  private Connection connection;
  private Statement statement;

  public Jdbc() throws SQLException, IOException {

    Properties properties = this.loadProperties();
    connection = DriverManager.getConnection(properties.getProperty("url"),
        properties.getProperty("user"),
        properties.getProperty("password")
    );
    statement = connection.createStatement();

    System.out.println("Connection");
  }


  public Properties loadProperties() throws IOException {
    try (InputStream inputStream = this.getClass().getResourceAsStream("db.properties")){
      Properties properties = new Properties();
        properties.load(inputStream);

        //inputStream.close();
        return properties;
      }

  }

  public void addPlayer(Player player) throws SQLException {
    String name = player.getName();
    char symbol = player.getSymbol();
    if (containDublicatePlayer(name)) {
      return;
    }

    try (PreparedStatement statement = connection
        .prepareStatement("insert into players(name, symbol) values(?, ?)")) {
      String playerSymbol = "" + symbol;
      statement.setString(1, name);
      statement.setString(2, playerSymbol);

      statement.execute();
      statement.close();
    }
  }


  public void addWinner(Player player, int score) throws SQLException {
    int idPlayer = getPlayerId(player);

    if (containDublicateScore(player.getName())) {
      addScore(idPlayer);
      return;
    }

    try (PreparedStatement statement = connection
        .prepareStatement("insert into score(player_id, score) values(?, ?)")) {

      statement.setString(1, String.valueOf(idPlayer));
      statement.setString(2, String.valueOf(score));

      statement.execute();
    }
  }

  private void addScore(int id) throws SQLException {
    try (PreparedStatement preparedStatement = connection
        .prepareStatement("select score from score where id = ?")) {
      preparedStatement.setInt(1, id);
      ResultSet rs = preparedStatement.executeQuery();
      rs.next();
      int score = rs.getInt("score") + 1;


      PreparedStatement preparedStatement2 = connection
          .prepareStatement("update score set score = ? where id=?");
      preparedStatement2.setInt(1, score);
      preparedStatement2.setInt(2, id);

      preparedStatement2.execute();
      if (preparedStatement != null) {
        preparedStatement.close();
      }
      if (preparedStatement2 != null) {
        preparedStatement2.close();

      }
    }
  }

  private int getPlayerId(Player player) throws SQLException {
    try (PreparedStatement preparedStatementFirst = connection
        .prepareStatement("select * from players where name = ?")) {
      preparedStatementFirst.setString(1, player.getName());

      ResultSet resultSet = preparedStatementFirst.executeQuery();
      int id = 0;
      if (resultSet.next()) {
        id = resultSet.getInt("id");
      }
      preparedStatementFirst.close();
      return id;
    }
  }


  private boolean containDublicateScore(String name) throws SQLException {
    boolean nameExists = false;
    try (ResultSet resultSet = statement
        .executeQuery("SELECT p.name FROM score s INNER JOIN players p ON s.player_id = p. id")) {
      String foundName;
      while (resultSet.next()) {
        foundName = resultSet.getString("p.name");
        if (foundName.equals(name)) {
          nameExists = true;
          break;
        }
      }

      return nameExists;
    }
  }

  public void printScore() throws SQLException {
    try (ResultSet resultSet = statement.executeQuery(
        "SELECT p.name, s.score FROM score s INNER JOIN players p ON s.player_id = p. id")) {

      while (resultSet.next()) {
        String name = resultSet.getString("p.name");
        String symbol = resultSet.getString("s.score");

        System.out.println(name + " - " + symbol);
      }
    }
  }

  public void printPlayers() throws SQLException {
    try (ResultSet resultSet = statement.executeQuery("select * from players")) {

      while (resultSet.next()) {
        String name = resultSet.getString("name");
        String symbol = resultSet.getString("symbol");

        System.out.println(name + " - " + symbol);
      }
    }
  }

  private boolean containDublicatePlayer(String name) throws SQLException {
    boolean nameExists = false;
    try (ResultSet resultSet = statement.executeQuery("select name from players")) {
      String foundName;
      while (resultSet.next()) {
        foundName = resultSet.getString("name");
        if (foundName.equals(name)) {
          nameExists = true;
          break;
        }
      }
      return nameExists;

    }

  }
}
