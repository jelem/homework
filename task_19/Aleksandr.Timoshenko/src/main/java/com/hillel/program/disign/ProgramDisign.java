package com.hillel.program.disign;

public class ProgramDisign extends TemplateProgramDisign {

  @Override
  protected void writeProgramCode() {
    System.out.println("Write your code");
  }

  @Override
  protected void debugProgramCode() {
    System.out.println("Check your code");
    if (debugCheck()) {
      System.out.println("No bugs in the program");
    } else {
      debugCheck();
    }
  }

  private boolean debugCheck() {
    System.out.println("Start debugging");
    if (false) {
      debugCheck();
    }
    return true;
  }

  @Override
  protected void compileProgramCode() {
    System.out.println("Compile your code");
  }

  @Override
  protected void testingProgram() {
    System.out.println("Start the program tests");
    if (testProgram()) {
      System.out.println("Program tested successfully");
    } else {
      testProgram();
    }
  }

  private boolean testProgram() {
    System.out.println("Start test");
    if (false) {
      debugCheck();
    }
    return true;
  }

  @Override
  protected void runProgram() {
    System.out.println("The program is ready to provide the results");
  }
}
