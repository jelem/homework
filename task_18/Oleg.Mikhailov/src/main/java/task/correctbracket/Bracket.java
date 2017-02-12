package task.correctbracket;

public class Bracket {

  private Character[] stack;
  private int point = 0;

  public boolean correctInputBct(String item) {
    stack = new Character[item.length()];
    fillStack(item);
    return searchIncorrectBct(stack);
  }

  private boolean searchIncorrectBct(Character[] stack) {
    int countFirstType = 0;
    int countSecondType = 0;
    int countThirdType = 0;
    for (Character elem : stack) {
      if (elem == '(') {
        countFirstType++;
      }
      if (elem == '{') {
        countSecondType++;
      }
      if (elem == '[') {
        countThirdType++;
      }
      if (elem == ')') {
        countFirstType--;
      }
      if (elem == '}') {
        countSecondType--;
      }
      if (elem == ']') {
        countThirdType--;
      }
    }
    boolean status = countFirstType != 0 || countSecondType != 0 || countThirdType != 0;
    clearStack(stack);
    return !status;
  }

  private void clearStack(Character[] stack) {
    for (int i = 0; i < stack.length; i++) {
      stack[i] = null;
    }
    point = 0;
  }

  private void push(String item) {
    stack[point] = item.charAt(point);
    point++;
  }

  private void fillStack(String item) {
    for (Character elem : stack) {
      push(item);
    }
  }
}
