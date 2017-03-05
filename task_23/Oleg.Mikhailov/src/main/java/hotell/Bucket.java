package hotell;

import java.util.ArrayList;
import java.util.HashMap;

public class Bucket {

  private HashMap<Visitor, Room> bucket = new HashMap<Visitor, Room>();
  private ArrayList<Integer> cacheHash = new ArrayList<Integer>();
  private ArrayList<Visitor> cacheVisitor = new ArrayList<Visitor>();

  public void put(Visitor visitor, Room room) {
    bucket.put(visitor, room);
    cacheHash.add(visitor.hashCode());
    cacheVisitor.add(visitor);
  }


  public void get(String lastName) {
    int hash = hashCode(lastName);
    for (int i = 0; i < bucket.size(); i++) {
      if (hash == cacheHash.get(i)) {
        System.out.println(bucket.get(cacheVisitor.get(i)));
        break;
      }
    }
  }


  public int hashCode(String lastName) {
    return (lastName != null) ? takeChar(lastName) : 0;
  }

  private int takeChar(String lastName) {
    int number;
    if (lastName.charAt(0) == lastName.toLowerCase().charAt(0)) {
      number = lastName.charAt(0) - 'a';
      return number;
    }
    number = lastName.charAt(0) - 'A';
    return number;
  }

}
