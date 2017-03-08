package com.hillel.tasks.too;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestCustomLinkedList {

  CustomLinkedList emptyList;
  CustomLinkedList linkedList;

  @Before
  public void steUp() {
    emptyList = new CustomLinkedList();
    linkedList = new CustomLinkedList();
    linkedList.add("Big");
    linkedList.add("Date");
    linkedList.add("Test");
    linkedList.add("Text");
    linkedList.add("Li");
    linkedList.add("Tok");
    linkedList.add("Set");
  }

  @Test
  public void testAdd() {
    emptyList.add("Value");
    assertThat(emptyList.peek(), is("Value"));
  }

  @Test
  public void testSearchInPosition() {
    assertThat(linkedList.searchInPosition(2), is("Tok"));
  }

  @Test
  public void testGetItemIndex() {
    assertThat(linkedList.getItemIndex(), is(7));
  }

  @Test
  public void testGet() {
    assertThat(linkedList.get(3), is("Test"));
  }

  @Test
  public void testHasCycle() {
    linkedList.introduceCycle(2);
    assertThat(linkedList.hasCycle(), is(true));
  }

  @Test
  public void testPull() {
    assertThat(linkedList.pull(), is("Big"));
  }

}
