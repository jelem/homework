package com.hillel.homework;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Convertator converter = new Convertator();
    converter.readStudents();
    converter.writeStudents();
  }
}
