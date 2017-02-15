package com.lessons.collections;


import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class CustomArrayList implements CustomList, Iterable {

  public static final int INITIAL_CAPACITY = 10;
  private String[] array;

  private int size = 0;

  public CustomArrayList() {
    this(INITIAL_CAPACITY);
  }

  public CustomArrayList(int capacity) {
    array = new String[capacity];
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean contains(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  public void add(String element) {
    resizeArray();
    array[size] = element;
    size++;
  }

  public void add(int index, String element) {
    size = index - 1;
    resizeArray();
    array[index - 1] = element;
    size++;

  }

  private void resizeArray() {
    if (size == array.length) {
      String[] newArray = new String[array.length * 2];
      for (int i = 0; i < newArray.length; i++) {
        newArray[i] = array[i];
      }
      array = newArray;
    }

    if (size == array.length / 4) {
      String[] newArray = new String[array.length / 2];
      for (int i = 0; i < newArray.length; i++) {
        newArray[i] = array[i];
      }
      array = newArray;
    }

  }


  public void remove(String element) {
    resizeArray();
    int index = indexOf(element);
    for (int i = index + 1; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    array[size - 1] = null;
    size--;
  }

  public String remove(int index) {
    resizeArray();
    String element = get(index);
    for (int i = index + 1; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    array[size--] = null;
    return element;
  }

  public void clear() {
    size = 0;
    resizeArray();
  }

  public String get(int index) {
    if (size < index - 1) {
      throw new NoSuchElementException("No such index in array");
    }
    return array[index - 1];
  }

  public String get(int index, String element) {
    if (array[index].equals(element)) {
      return element;
    }
    throw new NoSuchElementException("No such element on this index");
  }

  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    throw new NoSuchElementException("No such element");
  }

  @Override
  public Iterator iterator() {
    return new ListIterator();
  }

  public Iterator backwardIterator() {
    return new BackwardListIterator();
  }

  public Iterator randomIterator() {
    return new RandomListIterator();
  }

  private class ListIterator implements Iterator {

    private int current;

    ListIterator() {
      current = 0;
    }

    public boolean hasNext() {
      return current < size;
    }

    public Object next() {
      if (current > size) {
        throw new NoSuchElementException();
      }

      String element = array[current];
      current++;
      return element;
    }


  }


  private class BackwardListIterator implements Iterator {

    private int current;

    BackwardListIterator() {
      current = size;
    }


    @Override
    public boolean hasNext() {
      return current != 0;
    }

    @Override
    public Object next() {
      if (current > size) {
        throw new NoSuchElementException();
      }
      String element = array[current];
      current--;
      return element;
    }
  }


  private class RandomListIterator implements Iterator {

    private int current;
    private int counter;
    private Integer[] arrayIndex = new Integer[size];

    RandomListIterator() {
      current = 0;
      counter = 0;
    }

    @Override
    public boolean hasNext() {
      return counter < size;
    }

    @Override
    public Object next() {
      String element = null;
      int generateNumber = generateRandomNumber();
      if (isRandomNumberInArray(generateNumber)) {
        next();
      } else {
        current = generateNumber;
        element = array[current];
        counter++;
      }
      return element;
    }

    private int generateRandomNumber() {
      Random random = new Random();
      return random.nextInt(size);
    }

    private boolean isRandomNumberInArray(int generateNumber) {
      for (int i = 0; i < size; i++) {
        if (generateNumber == arrayIndex[i]) {
          return true;
        }
      }

      for (int i = 0; i < size; i++) {
        if (arrayIndex[i] == null) {
          arrayIndex[i] = generateNumber;
        }
      }
      return false;
    }
  }


}
