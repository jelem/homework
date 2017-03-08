package com.hillel.tasks.one;

public class Stack {

  private char[] array = new char[20];
  private int lastElement = 0;

  public void push(char item) {
    array[lastElement] = item;
    lastElement++;
  }

  public char pop() {
    lastElement--;
    char item = (char) array[lastElement];
    array[lastElement] = 0;
    return item;
  }

  public char peek() {
    return array[lastElement - 1];
  }

  public int getLastElement() {
    return lastElement;
  }

}
