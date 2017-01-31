package factory;


public class Worker3 implements MainWorker {
  String name;

  public Worker3(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void work() {
    System.out.println("the third worker do the Third Detail");
  }
}
