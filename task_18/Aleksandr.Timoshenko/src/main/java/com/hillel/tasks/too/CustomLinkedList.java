package com.hillel.tasks.too;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class CustomLinkedList {

  private Node first;
  private Node last;
  private int itemIndex = 0;

  public void add(String item) {
    Node node = new Node(item, null);

    if (last == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;
    itemIndex++;
  }

  public int getItemIndex() {
    return itemIndex;
  }

  public String searchInPosition(int position) {
    Node firstNode = this.first;
    Node secondNode = this.first;
    for (int i = 0; i < position; i++) {
      if (secondNode == null) {
        throw new NoSuchElementException();
      }
      secondNode = secondNode.next;
    }
    if (secondNode == null) {
      throw new NoSuchElementException();
    }
    while (secondNode != null) {
      firstNode = firstNode.next;
      secondNode = secondNode.next;
    }
    return firstNode.value;
  }

  public String pull() {
    String item = first.value;
    first = first.next;
    return item;
  }

  public String peek() {
    return first.value;
  }

  public String get(int index) {
    int currentIndex = 1;
    Node current = first;
    while (currentIndex < index && current != null) {
      currentIndex++;
      current = current.next;
    }
    if (current == null) {
      throw new NoSuchElementException();
    }
    return current.value;
  }

  public void introduceCycle(int index) {
    Node currentNode = this.first;
    for (int i = 0; i <= index; i++) {
      if (currentNode == null) {
        throw new NoSuchElementException();
      }
      currentNode = currentNode.next;
    }
    this.last.next = currentNode;
  }

  public boolean hasCycle() {
    Node firstNode = this.first;
    Node secondNode = this.first.next;
    for (int i = 0; i < getItemIndex() * 2; i++) {
      firstNode = firstNode.next;
      secondNode = secondNode.next.next;
      if (firstNode.equals(secondNode)) {
        return true;
      }
      if (secondNode == null | secondNode.next == null) {
        return false;
      }
    }
    return true;
  }

  public String searchFromLast(int position) {
    return get(itemIndex - 1 - position);
  }

  @Override
  public String toString() {
    StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
    Node current = first;
    while (current != null) {
      stringJoiner.add(current.value);
      current = current.next;
    }
    return stringJoiner.toString();
  }

  public Iterator iterator() {
    return new CustomLinkedListIterator();
  }

  private class CustomLinkedListIterator implements Iterator {

    private int current;
    Node currentNode;

    public CustomLinkedListIterator() {
      currentNode = first;
      current = 0;
    }

    @Override
    public boolean hasNext() {
      return currentNode != null;
    }

    @Override
    public Object next() {
      if (currentNode == null) {
        throw new NoSuchElementException("No Such Element");
      }
      String data = currentNode.value;
      currentNode = currentNode.next;
      current++;
      return data;
    }
  }

  private static class Node {

    String value;
    Node next;

    Node(String value) {
      this.value = value;

    }

    Node(String value, Node next) {
      this.value = value;
      this.next = next;
    }


  }
}
