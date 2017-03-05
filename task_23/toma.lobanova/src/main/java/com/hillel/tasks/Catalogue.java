package com.hillel.tasks;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Catalogue {
  HashMap<Guest, Room> catalogue;
  private static final int CAPACITY = 22;

  public Catalogue() {
    catalogue = new HashMap<Guest, Room>(CAPACITY);
  }

  public void put(Guest guest, Room room) {
    catalogue.put(guest, room);
  }

  public Room get(Guest guest) {
    return catalogue.get(guest);
  }

  public int getCapacity() {
    return catalogue.size();
  }

  public Class getCatalogueClass() {
    return catalogue.getClass();
  }

  public String buckets() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    // Pull out the table.
    StringBuilder builder = new StringBuilder();
    Field field = catalogue.getClass().getDeclaredField("table");
    field.setAccessible(true);
    Object[] table = (Object[]) field.get(catalogue);
    int bucket = 0;
    // Walk it.
    for (Object object : table) {
      if (object != null) {
        // At least one in this bucket.
        int count = 1;
        // What's in the `next` field?
        Field nf = object.getClass().getDeclaredField("next");
        nf.setAccessible(true);
        Object next = nf.get(object);
        if (next != null) {
          do {
            // Count them.
            count += 1;
          }
          while ((next = nf.get(next)) != null);
        }
        builder.append(bucket + " = " + count + '/');
      }
      bucket += 1;
    }
    return builder.toString();
  }
}

