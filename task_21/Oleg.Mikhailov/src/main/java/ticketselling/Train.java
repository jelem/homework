package ticketselling;


public class Train {

  private static final int VAGON_COUNT = 3;
  private Wagon[] wagon;

  public Train() {
    this.wagon = new Wagon[VAGON_COUNT];
    for (int i = 0; i < VAGON_COUNT; i++) {
      wagon[i] = new Wagon.Builder()
          .build();
    }
  }

  public Train(int numberOfWagon) {
    this.wagon = new Wagon[numberOfWagon];
    for (int i = 0; i < numberOfWagon; i++) {
      wagon[i] = new Wagon.Builder()
          .build();
    }
  }

  public Wagon getWagon(int numberWagon) {
    return wagon[numberWagon];
  }
}
