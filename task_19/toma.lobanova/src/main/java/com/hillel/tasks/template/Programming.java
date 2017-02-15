package com.hillel.tasks.template;

public abstract class Programming {
  public final void developProgram() {
    writeCode();
    refactor();
    compile();
    test();
    runAnalizeResults();
  }

  abstract void writeCode();

  abstract void refactor();

  abstract void compile();

  abstract void test();

  abstract void runAnalizeResults();
}
