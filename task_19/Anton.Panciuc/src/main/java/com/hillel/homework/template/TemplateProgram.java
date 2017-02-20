package com.hillel.homework.template;


public abstract class TemplateProgram {

  public final void createProgram() {
    writeCode();
    debugCode();
    compileCode();
    testingCode();
    runCode();
  }

  protected abstract void runCode();

  protected abstract void compileCode();

  protected abstract void debugCode();

  protected abstract void writeCode();

  protected abstract void testingCode();

}
