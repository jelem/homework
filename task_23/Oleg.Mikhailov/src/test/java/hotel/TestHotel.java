package hotel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class TestHotel {

  Map<Visitor, Room> map;
  Visitor oleg;
  Visitor serg;
  Visitor gendalf;

  Room room1;
  Room room2;
  Room room3;


  @Before
  public void setUp() {
    map = new HashMap<Visitor, Room>();

    oleg = new Visitor("Oleg", "Mikhailov");
    serg = new Visitor("Serg", "Mikhailov");
    gendalf = new Visitor("Gendalf", "Gray");

    room1 = new Room(2, 23);
    room2 = new Room(1, 12);
    room3 = new Room(100, 1);
  }

  @Test
  public void testPut() {
    map.put(oleg, room1);
    assertThat(map.size(), is(1));
    map.put(serg, room2);
    assertThat(map.size(), is(2));
  }

  @Test
  public void testGetEmptyMap() {
    assertThat(map.get(oleg), is((Room) null));
  }

  @Test
  public void testGet() {
    map.put(oleg, room1);
    map.put(serg, room2);
    map.put(gendalf, room3);
    assertThat(map.get(oleg), is(room1));
    assertThat(map.get(gendalf), is(room3));
  }

  @Test
  public void testHashCode() {
    assertThat(oleg.hashCode(), is(12));
  }

  @Test
  public void testEqualHashCode() {
    boolean realResult = oleg.hashCode() == serg.hashCode();
    assertThat(realResult, is(true));

    boolean realResult2 = oleg.hashCode() == gendalf.hashCode();
    assertThat(realResult2, is(false));
  }

}
