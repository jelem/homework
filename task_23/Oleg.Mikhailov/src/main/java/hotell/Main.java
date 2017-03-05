package hotell;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<Visitor,Room> bucket = new HashMap<Visitor, Room>();

    Visitor oleg = new Visitor("Oleg", "Mikhailov");
    Visitor toma = new Visitor("Toma", "cobanova");

    Room first = new Room(2, 23);
    Room second = new Room(1, 12);

    bucket.put(oleg, first);
    bucket.put(toma, second);
  }
}
