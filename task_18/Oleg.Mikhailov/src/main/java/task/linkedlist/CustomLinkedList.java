package task.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class CustomLinkedList {

  private int count;
  private Node first;
  private Node last;
  private Node prev;

  public void add(String item) {
    prev = last;
    Node node = new Node(item, null, null);
    if (last == null) {
      first = node;
      last = node;
      prev = node;
      last.prev = node;
      prev.prev = node;
    } else {
      last.next = node;
      last = node;
      last.prev = prev;
    }
    count++;
  }

  public void add(int index, String item) {
    if (index < 0 || index >= count + 1) {
      throw new IndexOutOfBoundsException("Last element has index: " + (count - 1));
    }
    if (index == 0) {
      addFirstElem(item);
      count++;
      return;
    }
    if (index == count) {
      add(item);
      return;
    }
    Node current = findCurrent(index);
    addNewNode(current, item);
    count++;
  }

  private void addLastElem(String item) {
    Node node = new Node(item);
    Node tmp = last;
    last = node;
    last.prev = tmp;
  }

  private void addFirstElem(String item) {
    Node node = new Node(item);
    Node tmp = first;
    first = node;
    first.prev = node;
    first.next = tmp;
  }

  private void addNewNode(Node current, String item) {
    Node node = new Node(item);
    Node tmp = current.next;
    current.next = node;
    node.prev = current;
    node.next = tmp;
    tmp.prev = node;
  }

  private Node findCurrent(int index) {
    Node tmp = first;
    for (int i = 0; i < index - 1; i++) {
      tmp = tmp.next;
    }
    return tmp;
  }

  public boolean hasCycle() {
    Node current = first;
    for (int i = 1; i < count; i++) {
      current = current.next;
    }
    return current.next != null;
  }

  public String getElemFromLast(int number) {
    Node current = last;

    for (int i = count; i > count - number; i--) {
      current = current.prev;
    }
    return current.value;
  }

  public String removeFirst() {
    if (first != null) {
      String elem = first.value;
      first = first.next;
      count--;
      return elem;
    } else {
      throw new NullPointerException();
    }
  }

  public String removeLast() {
    count--;
    String elem = last.value;
    last = prev;
    prev = last.prev;
    return elem;
  }

  public String peek() {
    return first.value;
  }

  public String get(int index) {
    int currentIndex = 0;
    Node current = first;
    if (current == null) {
      throw new NullPointerException();
    }

    while (current != null && currentIndex < index) {
      currentIndex++;
      current = current.next;
    }
    if (current == null) {
      throw new NoSuchElementException();
    }
    return current.value;
  }

  public Iterator linkIterator() {
    return new LinkedListIterator();
  }

  @Override
  public String toString() {
    Node element = first;
    if (element != null) {
      StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
      for (int i = 0; i < count; i++) {
        stringJoiner.add(element.value);
        element = element.next;
      }
      return stringJoiner.toString();
    } else {
      return "";
    }
  }

  public int getCount() {
    return count;
  }

  private class LinkedListIterator implements Iterator {

    private int countElem;

    @Override
    public boolean hasNext() {
      return countElem < count;
    }

    @Override
    public Object next() {
      Node tmp = first;
      if (countElem < count) {
        throw new NoSuchElementException("No elements");
      }
      for (int i = 0; i < countElem; i++) {
        tmp = tmp.next;
      }
      countElem++;
      return tmp.value;
    }
  }

  private static class Node {

    String value;
    Node next;
    Node prev;

    public Node(String value) {
      this.value = value;
    }

    public Node(String value, Node next, Node prev) {
      this.prev = prev;
      this.value = value;
      this.next = next;
    }
  }

}
