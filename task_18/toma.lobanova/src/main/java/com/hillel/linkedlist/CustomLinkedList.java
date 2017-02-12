package com.hillel.linkedlist;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class CustomLinkedList implements Iterable {
  Node first;
  int count;
  Node last;

  public void add(int data) {
    Node node = new Node(data);
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
      throw new EmptyStackException();
    }
    if (position < 0 || position >= count) {
      throw new IllegalArgumentException();
    }
    while (currentIndex <= position) {
      currentIndex++;
      current = current.next;
    }

    return current.data;
  }

  public void remove() {
    if (first != null) {
      Node temp = first.next;
      first = temp;
      count--;
    } else {
      throw new EmptyStackException();
    }
    if (count == 0) {
      last = null;
    }
  }

  public void introduceCycle(int index) {
    Node current = first;
    for (int i = 1; i <= index; i++) {
      current = current.next;
    }
    last.next = current;
  }

  public boolean hasCycle() {
    Node current = first;
    for (int i = 1; i < count; i++) {
      current = current.next;
    }
    return current.next != null;
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
        joiner.add(current.data + "");
        current = current.next;
      }
      return joiner.toString();
    } else {
      return "";
    }
  }

  public void insertByPosition(int data, int position) {
    Node currentNode = first;
    if (currentNode != null && position != count) {
      if (position > count || position < 0) {
        throw new IllegalArgumentException("Position of insertion was set wrong");
      }
      Node newNode = new Node(data);
      for (int i = 1; i < position; i++) {
        currentNode = currentNode.next;
      }
      Node nextFromCurrent = currentNode.next;
      currentNode.next = newNode;
      newNode.next = nextFromCurrent;
      count++;
    } else {
      add(data);
    }
  }

  public void removeByPosition(int position) {
    if (position >= count || position < 0) {
      throw new IllegalArgumentException("Position of the removed element was set wrong");
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
      int data = currentNode.data;
      currentNode = currentNode.next;
      current++;
      return data;
    }
  }

  private static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }

    @Override
    public String toString() {
      return data + "";
    }
  }
}
