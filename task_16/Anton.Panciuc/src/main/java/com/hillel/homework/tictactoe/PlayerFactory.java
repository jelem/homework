package com.hillel.homework.tictactoe;


public class PlayerFactory {


  public Player createCurrentPlayer() {
    ConsoleReader reader;
    reader = new ConsoleReader();

    System.out.println("How many players One or Two");
    String type = reader.getInput();

    Player player = null;
    if (type.equals("Two")) {
      player = getHumanPlayer(reader);
    } else if (type.equals("One")) {
      player = getAIPlayer(reader);
    }
    return player;
  }

  private Player getAIPlayer(ConsoleReader reader) {
    Player player;
    System.out.println("Chose difficulty Easy or Hard");
    String difficultyType = reader.getInput();
    player = new AiPlayer(setDifficulty(difficultyType));
    if (difficultyType.equals("Hard")) {
      player.setSymbol(Field.CROSS);
    }
    return player;
  }

  private Player getHumanPlayer(ConsoleReader reader) {
    Player player;
    System.out.println("Enter second player name");
    String name = reader.getInput();
    player = new HumanPlayer(name);
    return player;
  }

  public Difficulty setDifficulty(String difficultyType) {
    Difficulty difficulty = null;

    if (difficultyType.equals("Easy")) {
      difficulty = new DifficultyEasy();
    } else if (difficultyType.equals("Hard")) {
      difficulty = new DifficultyHard();
    }
    return difficulty;
  }
}
