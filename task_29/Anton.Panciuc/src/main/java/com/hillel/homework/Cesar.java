package com.hillel.homework;


import java.util.Arrays;
import java.util.List;

public final class Cesar {

  static final List<Character> alphabet =
      Arrays.asList('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H',
          'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i',
          'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm');


  public static String encrypt(String text) {
    int move = 5;
    int listSize = alphabet.size();
    StringBuilder cryptogram = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char currentCahr = text.charAt(i);
      int index = alphabet.indexOf(currentCahr);
      index = (index + move) % listSize;
      cryptogram.append(alphabet.get(index));
    }
    return cryptogram.toString();
  }

  public static String decrypt(String text) {
    int move = 5;
    int listSize = alphabet.size();
    StringBuilder newText = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char currentChar = text.charAt(i);
      int index = alphabet.indexOf(currentChar);
      index = (index - move + listSize) % listSize;
      newText.append(alphabet.get(index));
    }
    return newText.toString();

  }
}

