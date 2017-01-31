package factory;


public class Factory {
  public static void main(String[] args) {


    MainWorker anna = new Worker1("Anna");
    MainWorker sveta = new Worker2("Sveta");
    MainWorker anjelika = new Worker3("Anjelika");

    MainWorker[] mainWorkers = new MainWorker[3];
    mainWorkers[0] = anna;
    mainWorkers[1] = sveta;
    mainWorkers[2] = anjelika;

    for (int i = 0; i < mainWorkers.length; i++) {
      String name = mainWorkers[i].getName();
      System.out.print(name + " ");
      mainWorkers[i].work();

    }

  }

}
