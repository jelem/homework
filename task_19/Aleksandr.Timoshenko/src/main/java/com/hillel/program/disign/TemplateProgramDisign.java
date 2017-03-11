package com.hillel.program.disign;

public abstract class TemplateProgramDisign {

  public final void createProgram() {
    writeProgramCode();
    debugProgramCode();
    compileProgramCode();
    testingProgram();
    runProgram();
  }

  abstract void writeProgramCode();

  abstract void debugProgramCode();

  abstract void compileProgramCode();

  abstract void testingProgram();

  abstract void runProgram();

}
