package program;

public abstract class Decompile {

  abstract void writeCode();
  abstract boolean debug();
  abstract void compile();
  abstract boolean testing();
  abstract void result();
  private boolean haveBug = true;
  private boolean haveBugCompile = true;

  public final void  runDecompile() {
    writeCode();
    while (haveBug) {
      haveBug = debug();
    }
    compile();
    while (haveBugCompile) {
      haveBugCompile = testing();
      compile();
    }
    result();
  }
}
