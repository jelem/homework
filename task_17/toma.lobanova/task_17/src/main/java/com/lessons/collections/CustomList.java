package com.lessons.collections;

import java.util.Iterator;

public interface CustomList extends Iterable {
  int size();

  int capacity();

  boolean isEmpty();

  boolean contains(String element);

  void add(String element);

  void add(int index, String element);

  void remove(String element);

  void remove(int index);

  void clear();

  String get(int index);

  int indexOf(String element);

  Iterator backwardListIterator();

  Iterator randomListIterator();
}
