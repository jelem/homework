package com.hillel.tictactoe.mvc;

public class TicTacToe {
  public static void main(String[] args) {
    UserMove userMove = new UserMove();
    Player human = new HumanPlayer(userMove);
    Board board = new TicTacToeBoard();
    AIRandom random = new AIPlayerRandom();
    AIPlayer ai = new SmartAIPlayer(board, random);
    Game game = new Game(board, human, ai);
    Controller controller = new GameController(game, userMove);
    View view = new ConsoleView(controller, game, board);
    game.registerObserver((GameObserver) view);
    view.run();
  }
}
