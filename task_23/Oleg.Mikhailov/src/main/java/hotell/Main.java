package hotell;

import java.util.HashMap;
import java.util.Map;

public class Main {


  public static void main(String[] args) {
    Map<Visitor, Room> map = new HashMap<Visitor, Room>();

    Visitor oleg = new Visitor("Oleg", "Mikhailov");
    Visitor serg = new Visitor("Serg", "Mikhailov");
    Visitor gendalf = new Visitor("Gendalf", "Gray");
    Visitor toma = new Visitor("Toma", "Lobanova");

    Room room1 = new Room(2, 23);
    Room room2 = new Room(1, 12);
    Room room3 = new Room(100, 1);
    Room room4 = new Room(100, 12);


    map.put(oleg, room1);
    map.put(toma, room2);
    map.put(gendalf, room3);
    map.put(serg, room4);

    Room room = map.get(serg);

    System.out.println(room);

  }

}

