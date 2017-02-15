package com.hillel.stack;

import java.util.EmptyStackException;

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
          try {
            stackSymbol = stack.pop();
          } catch (EmptyStackException exception) {
            System.out.println("Missing opening bracket for closing bracket in position " + (i + 1));
            return;
          }
          if (stringSymbol == ']' && stackSymbol != '['
              || stringSymbol == ')' && stackSymbol != '('
              || stringSymbol == '}' && stackSymbol != '{') {
            System.out.println("Order of brackets is wrong. Brackets in the string are not balanced");
            return;
          }
          break;
        default:
      }
    }
    if (!stack.isEmpty()) {
      System.out.println("Some brackets were not closed. Brackets in the string are not balanced");
      return;
    }
    System.out.println("Brackets in the string are balanced");
  }

  public static void main(String[] args) {
    checkBrackets("((({}()[])))");
    checkBrackets("(({)})");
    checkBrackets("{([])}");
    checkBrackets("}");
    checkBrackets("{([");
  }
}
