package template.method;

public class JavaCompiler extends Compiler {

  @Override
  protected void writeCode() {
    System.out.println("Write Java code");
  }

  @Override
  protected void correctErrors() {
    System.out.println("Correct errors");
  }

  @Override
  protected void compile() {
    System.out.println("Compile a program");
  }

  @Override
  protected void test() {
    System.out.println("Write tests");
  }

  @Override
  protected void launch() {
    System.out.println("Launch a byte-code");
  }

}
