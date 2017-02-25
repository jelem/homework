package worker;

public class WorkerMain {

  public static void main(String[] args) {

    Worker[] company = new Worker[5];
    Worker boss = new Boss();
    company[0] = boss;
    Worker ordinaryWorker1 = new OrdinaryWorker();
    company[1] = ordinaryWorker1;
    Worker ordinaryWorker2 = new OrdinaryWorker();
    company[2] = ordinaryWorker2;
    Worker ordinaryWorker3 = new OrdinaryWorker();
    company[3] = ordinaryWorker3;
    Worker secretary  = new Secretary();
    company[4] = secretary;

    for (int i = 0; i < company.length; i++) {
      company[i].work();
    }

  }

}
