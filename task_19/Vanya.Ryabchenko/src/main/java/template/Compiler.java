package template;

public abstract class Compiler {

  protected abstract void writeCode();

  protected abstract void correctErrors();

  protected abstract void compile();

  protected abstract void test();

  protected abstract void launch();

  public final void startProgram() {
    writeCode();
    correctErrors();
    compile();
    test();
    launch();
  }
}
