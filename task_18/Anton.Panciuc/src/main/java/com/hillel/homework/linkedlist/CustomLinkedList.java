package com.hillel.homework.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class CustomLinkedList implements Iterable {
  Node first;
  int count;
  Node last;

  public void add(int value) {
    Node node = new Node(value);
    if (last == null) {
      first = node;
      last = node;
    } else {
      last.next = node;
      last = node;
    }
    count++;
  }

  public int get(int position) {
    int currentIndex = 1;
    Node current = first;
    if (current == null) {
      throw new NoSuchElementException();
    }
    if (position < 0 || position >= count) {
      throw new IllegalArgumentException();
    }
    while (currentIndex <= position) {
      currentIndex++;
      current = current.next;
    }

    return current.value;
  }

  public void remove() {
    if (first != null) {
      Node temp = first.next;
      first = temp;
      count--;
    } else {
      throw new NoSuchElementException();
    }
    if (count == 0) {
      last = null;
    }
  }

  public void addCycle(int index) {
    Node current = first;
    for (int i = 1; i <= index; i++) {
      current = current.next;
    }
    last.next = current;
  }

  public boolean hasCycle() {
    Node current = first;
    Node twoStepsCurrent = first.next;
    for (int i = 1; i < count; i++) {
      current = current.next;
      twoStepsCurrent = getTwoStepsCurrent(twoStepsCurrent);
    }
    return current.next == twoStepsCurrent.next;
  }

  private Node getTwoStepsCurrent(Node twoStepsCurrent) {
    for (int j = 0; j < 2; j++) {
      twoStepsCurrent = twoStepsCurrent.next;
    }
    return twoStepsCurrent;
  }

  public int reverseSearch(int position) {
    return get(count - 1 - position);
  }

  @Override
  public String toString() {
    Node current = first;
    if (current != null) {
      StringJoiner joiner = new StringJoiner(", ", "[", "]");
      for (int i = 0; i < count; i++) {
        joiner.add(current.value + "");
        current = current.next;
      }
      return joiner.toString();
    } else {
      return "";
    }
  }

  public void addByPosition(int value, int position) {
    Node currentNode = first;
    if (currentNode != null && position != count) {
      if (position > count || position < 0) {
        throw new IllegalArgumentException("Invalid input");
      }
      Node newNode = new Node(value);
      for (int i = 1; i < position; i++) {
        currentNode = currentNode.next;
      }
      Node nextFromCurrent = currentNode.next;
      currentNode.next = newNode;
      newNode.next = nextFromCurrent;
      count++;
    } else {
      add(value);
    }
  }

  public void removeByPosition(int position) {
    if (position >= count || position < 0) {
      throw new IllegalArgumentException("No such element");
    }
    if (first == last) {
      remove();
    } else {
      Node currentNode = first;
      Node nextFromCurrent;
      for (int i = 1; i < position; i++) {
        currentNode = currentNode.next;
      }
      nextFromCurrent = currentNode.next;
      Node temp = nextFromCurrent.next;
      currentNode.next = temp;
      count--;
      if (count == 0) {
        last = null;
      }
    }
  }

  public Iterator iterator() {
    return new CustomLinkedListIterator();
  }

  private class CustomLinkedListIterator implements Iterator {
    int current;
    Node currentNode;

    public CustomLinkedListIterator() {
      currentNode = first;
      current = 0;
    }

    public boolean hasNext() {
      return currentNode != null;
    }

    public Object next() {
      if (currentNode == null) {
        throw new NoSuchElementException();
      }
      int value = currentNode.value;
      currentNode = currentNode.next;
      current++;
      return value;
    }
  }

  private static class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return value + "";
    }
  }
}
