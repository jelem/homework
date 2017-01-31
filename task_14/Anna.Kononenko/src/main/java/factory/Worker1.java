package factory;


public class Worker1 implements MainWorker {

  private String name;

  public Worker1(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void work() {
    System.out.println("the first worker do the First Detail");
  }
}






