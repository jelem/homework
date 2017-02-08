package com.hillel.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class CustomArrayList implements CustomList {

  private static final int INITIAL_CAPACITY = 10;
  private String[] array;
  private int size = 0;

  public CustomArrayList() {
    this(INITIAL_CAPACITY);
  }

  public CustomArrayList(int capacity) {
    array = new String[capacity];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(String element) {
    resizeArray();
    array[size] = element;
    size++;
  }

  public void add(int index, String element) {
    resizeArray();
    if (index == size + 1) {
      size++;
    }
    array[index - 1] = element;
  }

  private void resizeArray() {
    String[] arrayTmp;
    if (size == array.length) {
      arrayTmp = new String[size * 2];
      System.arraycopy(array, 0, arrayTmp, 0, size);
      array = arrayTmp;

    }
    if (size == array.length / 4) {
      arrayTmp = new String[array.length / 2];
      System.arraycopy(array, 0, arrayTmp, 0, size);
      array = arrayTmp;
    }
  }

  @Override
  public void remove(String element) {
    int index = indexOf(element);
    for (int i = index + 1; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    size--;
  }

  public String remove(int index) {
    int indexDelete = index;
    if (index == size) {
      array[index - 1] = null;
    }
    for (int i = index - 1; i < size - 1; i++) {
      array[i] = array[indexDelete];
      indexDelete++;
    }
    size--;
    array[size] = null;
    resizeArray();
    return array[index];
  }

  @Override
  public void clear() {
    size = 0;
    resizeArray();
  }

  @Override
  public String get(int index) {
    if (index <= 0) {
      throw new NullPointerException("An array starts at 1");
    }
    return array[index - 1];
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    throw new NoSuchElementException(
        "No such element int this list");
  }

  @Override
  public Iterator randomIterator(CustomList customArrayList) {
    return new RandomListIterator(customArrayList);
  }

  @Override
  public Iterator backwardIterator(CustomList list) {
    return new BackwardListIterator(list);
  }

  @Override
  public Iterator iterator() {
    return new ListIterator();
  }


  private class ListIterator implements Iterator {

    private int current;

    ListIterator() {
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

    private int counter = size;

    BackwardListIterator(CustomList list) {
    }

    @Override
    public boolean hasNext() {
      return counter != 0;
    }

    @Override
    public Object next() {
      if (array.length == 0) {
        throw new NoSuchElementException();
      }
      counter--;
      return array[counter];
    }
  }

  private class RandomListIterator implements Iterator {

    private int counter;
    private int end;
    Random random = new Random();
    String[] tmpArray = new String[size];
    int index = 0;


    RandomListIterator(CustomList customArrayList) {
      this.counter = 0;
      this.end = customArrayList.size();
    }


    @Override
    public boolean hasNext() {
      counter++;
      return counter <= end;
    }

    @Override
    public Object next() {
      String element = array[random.nextInt(size)];
      if (tmpArray[0] == null) {
        tmpArray[0] = element;
        index++;
        return element;
      }
      boolean status = notContainsElement(element);
      while (status) {
        element = array[random.nextInt(size)];
        status = notContainsElement(element);
      }
      tmpArray[index] = element;
      index++;
      return element;
    }

    private boolean notContainsElement(String element) {
      int status = 0;
      for (int i = 0; i < counter - 1; i++) {
        if (!tmpArray[i].equals(element)) {
          status++;
          if (status == counter - 1) {
            return false;
          }
        }
      }
      return true;
    }
  }
}
