package com.hillel.homework.stack;


import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Brackets {
  public static void checkBrackets(String string) {
    Stack stack = new Stack();
    char stackSymbol;
    int length = string.length();
    char stringSymbol;
    for (int i = 0; i < length; i++) {
      stringSymbol = string.charAt(i);
      switch (stringSymbol) {
        case '[':
        case '(':
        case '{':
          stack.push(stringSymbol);
          break;
        case ']':
        case ')':
        case '}':
          stackSymbol = stack.pop();
          if (stringSymbol == ']' && stackSymbol != '['
              || stringSymbol == ')' && stackSymbol != '('
              || stringSymbol == '}' && stackSymbol != '{') {
            System.out.println("Brackets are not balanced");
            return;
          }
          break;
        default:
      }
    }
    if (!stack.isEmpty()) {
      System.out.println("Brackets are not balanced");
      return;
    }
    System.out.println("Brackets are balanced");
  }
}
