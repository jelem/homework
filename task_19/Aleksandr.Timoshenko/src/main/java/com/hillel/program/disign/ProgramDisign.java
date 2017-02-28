package com.hillel.program.disign;

public class ProgramDisign extends TemplateProgramDisign {

  public void main(String[] args) {

    writeProgramCode();
    debugProgramCode();
    compileProgramCode();
    testingProgram();
    runProgram();

  }

  @Override
  public void writeProgramCode() {
    System.out.println("Write your code");
  }

  @Override
  public void debugProgramCode() {
    System.out.println("Check your code");
    if (debugCheck()) {
      System.out.println("No bugs in the program");
    } else {
      debugCheck();
    }
  }

  public boolean debugCheck() {
    System.out.println("Start debugging");
    if (false) {
      debugCheck();
    }
    return true;
  }

  @Override
  void compileProgramCode() {
    System.out.println("Compile your code");
  }

  @Override
  void testingProgram() {
    System.out.println("Start the program tests");
    if (testProgram()) {
      System.out.println("Program tested successfully");
    } else {
      debugProgramCode();
      testProgram();
    }
  }

  public boolean testProgram() {
    if (false) {
      return false;
    }
    return true;
  }

  @Override
  void runProgram() {
    System.out.println("The program is ready to provide the results");
  }
}
