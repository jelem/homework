package task.correctbracket;

import java.util.Stack;

public class Bracket {

  private Stack<Character> stack = new Stack<Character>();

  public boolean correctInputBct(String item) {
    for (int i = 0; i < item.length(); i++) {
      if (stack.size() == 0) {
        stack.push(item.charAt(i));
        continue;
      }
      boolean first = item.charAt(i) == stack.peek() + 1;
      boolean second = item.charAt(i) == stack.peek() + 2;
      if (first || second) {
        stack.pop();
      } else {
        stack.push(item.charAt(i));
      }
    }
    return stack.size() == 0;
  }
}
