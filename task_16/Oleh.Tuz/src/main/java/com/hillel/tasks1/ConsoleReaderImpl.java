package com.hillel.tasks1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by TUZ on 13.02.2017.
 */
public class ConsoleReaderImpl implements ConsoleReader {
  Scanner scanner =
      new Scanner(System.in, StandardCharsets.UTF_8.toString());


  private static ConsoleReaderImpl consoleReader;

  public static ConsoleReader newInstance() {
    if (consoleReader == null) {
      consoleReader = new ConsoleReaderImpl();
    }
    return consoleReader;

  }

  private ConsoleReaderImpl() {

  }

  @Override
  public String getData() {


    String move = scanner.next();

    return move;
  }
}
