package second;

public class Company {

  private Worker[] workers;
  private int count;

  public Company(int workers) {
    this.workers = new Worker[3];
    this.count = 0;
  }

  public void addWorker(Worker worker) {
    this.workers[this.count] = worker;
    this.count++;
  }

  public void getWorkers() {
    for (Worker el : this.workers) {
      el.work();
    }
  }

  public static void main(String[] args) {
    Company company = new Company(3);
    company.addWorker(new WorkerDriver());
    company.addWorker(new WorkerManager());
    company.addWorker(new WorkerOperator());
    company.getWorkers();
  }
}
