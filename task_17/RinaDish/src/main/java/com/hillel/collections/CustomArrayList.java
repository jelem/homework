package com.hillel.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class CustomArrayList implements CustomList {

  public static final int INITIAL_CAPACITY = 10;
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
    for (int i = 0; i < size; i++) {
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


  @Override
  public void add(int index, String element) {
    size = index - 1;
    resizeArray();
    array[size] = element;
    size++;
  }

  private void resizeArray() {
    if (size == array.length) {
      String[] array1 = new String[array.length * 2];
      for (int i = 0; i < array.length; i++) {
        array1[i] = array[i];
        array = array1;
      }
      if (size == array.length / 4) {
        String[] array2 = new String[array.length / 2];
        for (int i = 0; i < array2.length; i++) {
          array2[i] = array[i];
          array = array2;
        }
      }
    }
  }

  @Override
  public void remove(String element) {
    resizeArray();
    ;
    int index = indexOf(element);
    for (int i = index + 1; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    array[size - 1] = null;
    size--;
  }

  @Override
  public String remove(int index) {
    resizeArray();
    String element = get(index);
    for (int i = index + 1; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    array[size--] = null;
    return element;
  }

  @Override
  public void clear() {
    size = 0;
    resizeArray();
  }

  @Override
  public String get(int index) {
    if (size < index - 1) {
      throw new NoSuchElementException("No such index in array");
    }
    return array[index - 1];
  }

  @Override
  public String get(int index, String element) {
    if (array[index].equals(element)) {
      return element;
    }
    throw new NoSuchElementException("No such element on this endex");
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }

    }
    throw new NoSuchElementException("No such element in the list");
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

    @Override
    public boolean hasNext() {
      return current < size;
    }

    @Override
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
      return current > 0;
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
    Integer[] cash = new Integer[size];

    RandomListIterator() {
      current = 0;
      counter = 0;
    }

    private int generatorRandomNumber() {
      Random random = new Random();
      return random.nextInt(size);
    }

    @Override
    public boolean hasNext() {
      return counter < size;
    }

    @Override
    public Object next() {
      String element = null;
      int generationNumber = generatorRandomNumber();
      if (isRandomNumberInCash(generationNumber)) {
        next();
      } else {
        current = generationNumber;
        element = array[current];
        counter++;
      }

      return element;
    }

    private boolean isRandomNumberInCash(int generationNumber) {
      for (int i = 0; i < cash.length; i++) {
        if (generationNumber == cash[i]) {
          return true;
        }
      }

      for (int i = 0; i < cash.length; i++) {
        if (cash[i] == null) {
          cash[i] = generationNumber;
        }
      }
      return false;
    }
  }

}
