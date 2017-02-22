package ticketselling;


public class Train {

  private static final int VAGON_COUNT = 3;
  private Wagon[] wagon;

  Wagon wagon1 = new Wagon.Builder()
      .placeWagon();
  public Train() {
    this.wagon = new Wagon[VAGON_COUNT];
    for (int i = 0; i < VAGON_COUNT; i++) {
    }
  }

  public Train(int numberOfWagon) {
    this.wagon = new Wagon[numberOfWagon];
  }







}
