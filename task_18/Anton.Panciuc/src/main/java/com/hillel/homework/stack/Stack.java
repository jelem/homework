package com.hillel.homework.stack;


import java.util.NoSuchElementException;

public class Stack {
  private static final int CAPACITY = 50;
  private char[] stack;
  private int pointer;

  public Stack() {
    this(CAPACITY);
  }

  public Stack(int capacity) {
    if (capacity > 0) {
      stack = new char[capacity];
    } else {
      throw new IllegalArgumentException("Capacity should be natural number");
    }
    pointer = -1;
  }

  public void push(char element) {
    if (!isFull()) {
      stack[++pointer] = element;
    } else {
      throw new StackOverflowError("Stack is full");
    }
  }

  public char pop() {
    if (!isEmpty()) {
      return stack[pointer--];
    } else {
      throw new NoSuchElementException();
    }
  }

  public void clear() {
    pointer = -1;
  }

  public boolean isEmpty() {
    return pointer == -1;
  }

  public boolean isFull() {
    return pointer == CAPACITY - 1;
  }

  public int getCount() {
    return pointer + 1;
  }

  public char peek() {
    if (!isEmpty()) {
      return stack[pointer];
    } else {
      throw new NoSuchElementException();
    }
  }
}
