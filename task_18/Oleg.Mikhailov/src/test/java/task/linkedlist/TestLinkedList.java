package task.linkedlist;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {

  private CustomLinkedList cleanList;
  private CustomLinkedList filledList;

  @Before
  public void setUp() {
    cleanList = new CustomLinkedList();
    filledList = new CustomLinkedList();
    filledList.add("a");
    filledList.add("b");
    filledList.add("c");
  }

  @Test
  public void testPeek() {
    assertThat(filledList.peek(), is("a"));
  }

  @Test
  public void testAdd() {
    cleanList.add("abc");
    assertThat(cleanList.peek(), is("abc"));
  }

  @Test
  public void testGet() {
    assertThat(filledList.get(1), is("b"));
    assertThat(filledList.get(2), is("c"));
  }

  @Test
  public void testAddIndex() {
    filledList.add(2, "Oleg");
    assertThat(filledList.get(2), is("Oleg"));
  }

  @Test
  public void testZiroPoinrAdd() {
    filledList.add(0, "Oleg");
    assertThat(filledList.get(0), is("Oleg"));
  }

  @Test
  public void testLastAdd() {
    filledList.add(3, "Oleg");
    assertThat(filledList.get(3), is("Oleg"));
  }

  @Test
  public void testSizeList() {
    cleanList.add("a");
    cleanList.add("b");
    cleanList.add("c");
    cleanList.add("d");
    cleanList.add(2, "as");
    assertThat(cleanList.getCount(), is(5));
    cleanList.removeFirst();
    assertThat(cleanList.getCount(), is(4));
  }

  @Test
  public void testHasCycleTrue() {
    assertThat(filledList.hasCycle(), is(false));
  }

  @Test
  public void testGetElementFromLast() {
    assertThat(filledList.getElemFromLast(2), is("a"));
  }

  @Test
  public void testRemoveFirst() {
    filledList.removeFirst();
    assertThat(filledList.peek(), is("b"));
  }

  @Test
  public void testRemoveLast() {
    filledList.removeLast();
    assertThat(filledList.get(1), is("b"));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testErrorAdd() {
    cleanList.add(5, "123");
  }

  @Test(expected = NullPointerException.class)
  public void testGetError() {
    cleanList.get(5);
  }

  @Test(expected = NoSuchElementException.class)
  public void testGetError2() {
    cleanList.add("abc");
    cleanList.get(3);
  }

}
