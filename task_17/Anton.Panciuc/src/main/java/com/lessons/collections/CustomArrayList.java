package com.lessons.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class CustomArrayList implements CustomList {
  private static final int INITIAL_CAPACITY = 10;
  private int size = 0;
  private int capacity = 0;
  private String[] array;

  public CustomArrayList() {
    this(INITIAL_CAPACITY);
  }

  public CustomArrayList(int capacity) {
    if (capacity > INITIAL_CAPACITY) {
      array = new String[capacity];
    } else {
      array = new String[INITIAL_CAPACITY];
    }
    this.capacity = array.length;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public int capacity() {
    return capacity;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(String element) {
    for (int i = 0; i < size; i++) {
      if ((array[i].equals(element))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(String element) {
    correctCapacity();
    array[size] = element;
    size++;
  }

  @Override
  public void add(int index, String element) {
    correctCapacity();
    size++;
    for (int i = size - 1; i > index; i--) {
      array[i] = array[i - 1];
    }
    array[index] = element;
  }

  private void correctCapacity() {
    String[] newArray = null;
    if (size == capacity) {
      capacity *= 2;
    }
    if (size <= capacity / 4 - 1) {
      capacity /= 2;
      if (capacity < 10) {
        capacity = 10;
      }
    }

    newArray = new String[capacity];
    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    array = newArray;
  }

  @Override
  public void remove(String element) {
    int index = indexOf(element);
    remove(index);
  }

  @Override
  public void remove(int index) {
    for (int i = index; i < size - 1; i++) {

      array[i] = array[i + 1];
    }
    array[--size] = null;
    correctCapacity();
  }

  @Override
  public void clear() {
    size = 0;
    correctCapacity();
  }

  @Override
  public String get(int index) {
    return array[index];
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    throw new NoSuchElementException("No such element in the array");
  }

  @Override
  public Iterator backwardListIterator() {
    return new BackwardListIterator();
  }

  @Override
  public Iterator randomListIterator() {
    return new RandomListIterator();
  }


  @Override
  public Iterator iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator {
    private int current;

    public ListIterator() {
      current = 0;
    }

    @Override
    public boolean hasNext() {
      return current < size;
    }

    @Override
    public Object next() {
      if (array.length == 0) {
        throw new NoSuchElementException();
      }

      String element = array[current];
      current++;
      return element;
    }
  }

  private class BackwardListIterator implements Iterator {
    private int current;

    public BackwardListIterator() {
      current = size - 1;
    }

    @Override
    public boolean hasNext() {
      return current >= 0;
    }

    @Override
    public Object next() {
      if (array.length == 0) {
        throw new NoSuchElementException();
      }
      
      String element = array[current];
      current--;
      return element;
    }
  }

  private class RandomListIterator implements Iterator {
    private int current;
    Random rand = new Random();
    List<Integer> indexArray = new ArrayList<Integer>();

    private void setCurrentIndex() {
      do {
        current = rand.nextInt(size);
      }
      while (indexArray.contains(current));
      indexArray.add(current);
    }

    @Override
    public boolean hasNext() {
      return indexArray.size() != size;
    }

    @Override
    public Object next() {
      setCurrentIndex();
      return array[current];
    }
  }
}
