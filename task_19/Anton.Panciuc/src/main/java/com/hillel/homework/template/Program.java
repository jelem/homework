package com.hillel.homework.template;

/**
 * Created by PowerUser on 16.02.2017.
 */
public class Program extends TemplateProgram {
  protected void runCode() {
    System.out.println("Run program and get result");
  }

  protected void compileCode() {
    System.out.println("Compile code");
  }

  protected void debugCode() {
    System.out.println("Debug code");
  }

  protected void writeCode() {
    System.out.println("Write program code");
  }

  protected void testingCode() {
    System.out.println("Testing code for bugs");
  }

}
