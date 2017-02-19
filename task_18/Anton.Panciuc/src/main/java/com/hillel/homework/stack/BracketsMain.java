package com.hillel.homework.stack;

import static com.hillel.homework.stack.Brackets.checkBrackets;

public class BracketsMain {
  public static void main(String[] args) {
    checkBrackets("((({}()[])))");
    checkBrackets("(({)})");
    checkBrackets("{([])}");
  }
}
