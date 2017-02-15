package com.hillel.tasks.template;

public class JavaProgramming extends Programming {
  @Override
  void writeCode() {
    System.out.println("Write Java code");
  }

  @Override
  void refactor() {
    System.out.println("Do refactoring and search for algorithm mistakes");
  }

  @Override
  void compile() {
    System.out.println("Compile the written code");
  }

  @Override
  void test() {
    System.out.println("Test the program");
  }

  @Override
  void runAnalizeResults() {
    System.out.println("Run the program and get the results");
  }
}
