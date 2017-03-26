package com.hillel.homework;

import java.util.ArrayList;
import java.util.List;

public class Cesar {
  List<Character> alphabet = new ArrayList<>();

  Cesar() {
    for (char c = 'A'; c <= 'z'; c++) {
      alphabet.add(c);
    }
  }

  String encrypt(String text) {
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

  public String decrypt(String text) {
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

