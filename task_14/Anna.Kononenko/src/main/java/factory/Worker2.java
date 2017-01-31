package factory;


public class Worker2 implements MainWorker {

  String name;

  public Worker2(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void work() {
    System.out.println("the second worker do the Second Detail");
  }
}
