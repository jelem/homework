package com.hillel.tasks;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CatalogueTests {
  Catalogue catalogue;
  Guest guest;
  Room room;

  @Before
  public void setUp() {
    catalogue = new Catalogue();
  }

  @Test
  public void putToCatalogueTest() {
    guest = new Guest.Builder()
        .setName("Toma")
        .setSurname("Lobanova")
        .setAge(30)
        .build();
    room = new Room(314);
    catalogue.put(guest, room);
    assertThat(catalogue.getCapacity(), is(1));
    fillCatalogue();
    assertThat(catalogue.getCapacity(), is(7));
  }

  @Test
  public void getFromCatalogue() {
    fillCatalogue();
    room = catalogue.get(new Guest.Builder()
        .setName("Catherine")
        .setSurname("Lobanova")
        .setAge(30)
        .build());
    assertThat(room, is(equalTo(new Room(314))));
  }

  private void fillCatalogue() {
    guest = new Guest.Builder()
        .setName("Catherine")
        .setSurname("Lobanova")
        .setAge(30)
        .build();
    room = new Room(314);
    catalogue.put(guest, room);
    guest = new Guest.Builder()
        .setName("Ivan")
        .setSurname("Ivanov")
        .setAge(35)
        .build();
    room = new Room(14);
    catalogue.put(guest, room);
    guest = new Guest.Builder()
        .setName("Nikolay")
        .setSurname("Nikolaev")
        .setAge(25)
        .build();
    room = new Room(215);
    catalogue.put(guest, room);
    guest = new Guest.Builder()
        .setName("Olga")
        .setSurname("Lobova")
        .setAge(18)
        .build();
    room = new Room(235);
    catalogue.put(guest, room);
    guest = new Guest.Builder()
        .setName("Oleg")
        .setSurname("Nikonov")
        .setAge(30)
        .build();
    room = new Room(24);
    catalogue.put(guest, room);
    guest = new Guest.Builder()
        .setName("Ivan")
        .setSurname("Nikolaev")
        .setAge(23)
        .build();
    room = new Room(555);
    catalogue.put(guest, room);
  }

  @Test
  public void bucketsNumberTest() throws NoSuchFieldException, IllegalAccessException {
    fillCatalogue();
    assertThat(catalogue.buckets(), is(equalTo("8 = 1/11 = 2/13 = 3/")));
  }
}
