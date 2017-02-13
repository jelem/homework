package com.lessons.collections;

import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    CustomList list = new CustomArrayList();
    list.add("first");
    list.add("second");
    list.add("third");
    list.add("forth");
    list.add("fifth");
    list.add("sixth");
    list.add("seventh");

    Iterator iterator = list.iterator();
    iterate(iterator);

    for (Object element : list) {
      System.out.print(element + " ");
    }

    System.out.println();

    iterator = list.backwardListIterator();
    iterate(iterator);

    iterator = list.randomListIterator();
    iterate(iterator);
  }

  public static void iterate(Iterator iterator) {
    while (iterator.hasNext()) {
      Object current = iterator.next();
      System.out.print(current + " ");
    }
    System.out.println();
  }
}
