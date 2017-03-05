package hotell;

import java.util.HashMap;

public class Main {


  public static void main(String[] args) {
    Bucket bucket = new Bucket();

    Visitor oleg = new Visitor("Oleg", "Mikhailov");
    Visitor oleg2 = new Visitor("Oleg", "Mikhailov");
    Visitor toma = new Visitor("Toma", "cobanova");

    Room first = new Room(2, 23);
    Room second = new Room(1, 12);

    bucket.put(oleg, first);
    bucket.put(toma, second);
    bucket.get("Mikhailov");




  }

}

