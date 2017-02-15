package com.hillel.task2;


public class Latters {
  private String name;
  private int page;
  private String text;

  public Latters(String name, int page, String text) {
    this.name = name;
    this.page = page;
    this.text = text;
  }

  public Latters() {
    this.name = "Oleg";
    this.page = 1;
    this.text = "Hello";
  }

  @Override
  public String toString() {
    return "Sender-" + name + ": page-" + page + "text" + text;
  }

}
