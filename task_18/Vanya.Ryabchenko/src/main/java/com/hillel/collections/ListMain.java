package com.hillel.collections;

public class ListMain {

  public static void main(String[] args) {
    CustomList<String> list = new CustomList<>();
    list.add("a");
    list.add("b");
    list.add("v");
    list.add("c");
    list.add("b");
    list.add("dfg");
    list.add("dg");
    list.add("df");
    System.out.println(list.hasCycle());

  }
}
