package hotell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bucket {
  private HashMap<Visitor, Room> bucket = new HashMap<Visitor, Room>();
  private ArrayList<Integer> cache = new ArrayList<Integer>();

  public void put(Visitor visitor, Room room) {
    bucket.put(visitor, room);
    cache.add(visitor.hashCode());
  }

  public ArrayList<Integer> getCache() {
    return cache;
  }

  public void get(String lastName) {
    int hash = hashCode(lastName);
    for (int i = 0; i < bucket.size(); i++) {
      if (hash == cache.get(i)) {
        System.out.println(bucket);
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
