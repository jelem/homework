package com.hillel.tasks.main;

import com.hillel.tasks.converting.TxtToXml;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    TxtToXml converter = new TxtToXml();
    converter.readStudents();
    converter.writeStudents();
  }
}
