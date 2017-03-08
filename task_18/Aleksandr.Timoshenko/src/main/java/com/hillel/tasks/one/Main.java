package com.hillel.tasks.one;


public class Main {

  Stack stack = new Stack();


  public boolean chackString(String brackets) {
    for (int i = 0; i < brackets.length(); i++) {
      char current = brackets.charAt(i);
      if (current == '(' | current == '{' | current == '[') {
        stack.push(current);
      } else if (current == ')') {
        if (stack.peek() == '(') {
          stack.pop();
          continue;
        }
      } else if (current == '}') {
        if (stack.peek() == '{') {
          stack.pop();
          continue;
        }

      } else if (current == ']') {
        if (stack.peek() == '[') {
          stack.pop();
          continue;
        }
      } else {
        break;
      }
    }
    int num = stack.getLastElement();
    if (num == 0) {
      return true;
    } else {
      return false;
    }
  }
}
