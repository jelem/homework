package com.lessons.collections;


import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    CustomList list = new CustomArrayList();

    for (int i = 0; i < 9; i++) {
      list.add(i + "");
    }
    list.add(4, "17");

    Iterator randomIterator = list.randomListIterator();

    while (randomIterator.hasNext()) {
      System.out.println(randomIterator.next());
    }
    System.out.println("==========================================");

    Iterator backwardIterator = list.backwardListIterator();

    while (backwardIterator.hasNext()) {
      System.out.println(backwardIterator.next());
    }

  }
}

