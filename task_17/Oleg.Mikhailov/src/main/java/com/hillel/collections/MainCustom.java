package com.hillel.collections;


import java.util.Iterator;

public class MainCustom {

  public static void main(String[] args) {
    CustomList list = new CustomArrayList();

    for (int i = 0; i < 5; i++) {
      list.add(i + "");
    }
    list.add(2, "252");

    Iterator randomIterator = list.randomIterator(list);

    while (randomIterator.hasNext()) {
      System.out.println(randomIterator.next());
    }

  }
}

