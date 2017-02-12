package com.lessons.collections;

public interface CustomList {

  int size();

  boolean isEmpty();

  boolean contains(String element);

  void add(String element);

  void add(int index, String element);

  void remove(String element);

  String remove(int index);

  void clear();

  String get(int index);

  String get(int index, String element);

  int indexOf(String element);


}
