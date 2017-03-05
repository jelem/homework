package hotell;

public class Main {


  public static void main(String[] args) {
    Bucket bucket = new Bucket();

    Visitor oleg = new Visitor("Oleg", "Mikhailov");
    Visitor serg = new Visitor("Serg", "Mikhailov");
    Visitor gendalf = new Visitor("Gendalf", "Gray");
    Visitor toma = new Visitor("Toma", "Lobanova");

    Room room1 = new Room(2, 23);
    Room room2 = new Room(1, 12);
    Room room3 = new Room(100, 1);
    Room room4 = new Room(100, 12);


    bucket.put(oleg, room1);
    bucket.put(toma, room2);
    bucket.put(gendalf, room3);
    bucket.put(serg, room4);
    bucket.get("Mikhailov");


  }

}

