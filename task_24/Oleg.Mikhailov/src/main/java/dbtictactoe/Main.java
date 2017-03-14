package dbtictactoe;


import java.io.IOException;
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) throws IOException, SQLException {

    Jdbc jdbc = new Jdbc();
    Board board = new TicTacToeBoard();
    Game game = new Game(board, jdbc);

    game.start();

  }
}
