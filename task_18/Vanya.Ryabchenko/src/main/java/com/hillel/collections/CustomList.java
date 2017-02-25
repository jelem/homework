package com.hillel.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomList<E> implements Iterable {

  private Node first;
  private Node last;
  private int counter = 0;

  public void add(E item) {

    Node node = new Node(item, null);

    if (last == null) {
      first = node;
    } else {
      last.next = node;
    }

    last = node;
    counter++;
  }

  public E poll() {
    E item = first.value;
    first = first.next;
    return item;
  }

  public E peek() {
    return first.value;
  }

  public E get(int index) {
    int currentIndex = 0;
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
    Node indexNode = this.first;
    for (int i = 0; i < index; i++) {
      if (indexNode == null) {
        throw new NoSuchElementException();
      }
      indexNode = indexNode.next;
    }
    if (indexNode == null) {
      throw new NoSuchElementException();
    }
    this.last.next = indexNode;
  }


  public boolean hasCycle() {
    Node firstNode = this.first;
    Node secondNode = this.first.next;
    for (int i = 0; i < getCounter() * 2; i++) {
      firstNode = firstNode.next;
      secondNode = secondNode.next.next;
      if (firstNode.equals(secondNode)) {
        return true;
      }
      if (secondNode == null || secondNode.next == null) {
        return false;
      }
    }
    return false;
  }

  public E foundValue(int number) {
    Node firstNode = this.first;
    Node secondNode = this.first;

    for (int i = 0; i < number; i++) {
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

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public Iterator iterator() {
    return new LinkedListIterator();
  }


  private class LinkedListIterator implements Iterator {

    int iteratorCounter = 0;


    @Override
    public boolean hasNext() {
      return iteratorCounter < counter;
    }

    @Override
    public E next() {
      Node current = first;
      if (counter < iteratorCounter) {
        throw new NoSuchElementException();
      }
      for (int i = 0; i < iteratorCounter; i++) {
        current = current.next;
      }
      iteratorCounter++;
      return current.value;
    }
  }

  private class Node {

    E value;
    Node next;

    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
        return false;
      }
      if (this == obj) {
        return true;
      }
      if (obj.getClass() != this.getClass()) {
        return false;
      }

      Node node = (Node) obj;

      if (value != null ? !value.equals(node.value) : node.value != null) {
        return false;
      }
      return next != null ? next.equals(node.next) : node.next == null;
    }

    @Override
    public int hashCode() {
      int result = value != null ? value.hashCode() : 0;
      result = 31 * result + (next != null ? next.hashCode() : 0);
      return result;
    }

    Node(E value, Node next) {
      this.value = value;
      this.next = next;

    }
  }


  public Node getFirst() {
    return first;
  }

  public Node getLast() {
    return last;
  }

  public int getCounter() {
    return counter;
  }
}
