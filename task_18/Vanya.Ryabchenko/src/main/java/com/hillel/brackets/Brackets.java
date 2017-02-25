package com.hillel.brackets;

import java.util.Stack;

public class Brackets {

  String sentence;
  Stack<Character> brackets = new Stack<Character>();

  public Brackets(String sentence) {
    this.sentence = sentence;
  }

  public boolean check() {
    boolean check = true;
    for (int i = 0; i < sentence.length(); i++) {
      if (check == true) {
        char bracket = sentence.charAt(i);
        switch (bracket) {
          case '(':
          case '[':
          case '{':
            brackets.push(bracket);
            break;
          default:
            break;
        }
        switch (bracket) {
          case ')':
          case ']':
          case '}':
            check = checking(bracket);
            break;
          default:
            break;
        }
      }
    }
    if (!brackets.isEmpty()) {
      return false;
    } else {
      return check;
    }
  }


  private boolean checking(char closedBracket) {
    boolean check = false;
    if (brackets.isEmpty()) {
      check = false;
    } else if (!brackets.isEmpty()) {
      char openBracket = brackets.pop();
      if (openBracket == '(' && closedBracket == ')' || openBracket == '{' && closedBracket == '}'
          || openBracket == '[' && closedBracket == ']') {
        check = true;
      } else {
        check = false;
      }
    }
    return check;
  }
}
