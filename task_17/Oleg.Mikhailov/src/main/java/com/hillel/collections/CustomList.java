package com.hillel.collections;

import java.util.Iterator;

public interface CustomList extends Iterable {

  int size();

  boolean isEmpty();

  boolean contains(String element);

  void add(String element);

  void add(int index, String element);

  void remove(String element);

  String remove(int index);

  void clear();

  String get(int index);

  int indexOf(String element);

  Iterator randomIterator(CustomList list);

  Iterator backwardIterator(CustomList list);
}
