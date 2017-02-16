package com.hillel.homework.linkedlist;

import org.junit.Before;
import org.junit.Test;


import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CustomLinkedListTest {
  CustomLinkedList list;

  @Before
  public void setUp() {
    list = new CustomLinkedList();
  }

  @Test
  public void addTest() {
    list.add(1);
    assertThat(list.toString(), is(equalTo("[1]")));
    for (int i = 2; i < 6; i++) {
      list.add(i);
    }
    assertThat(list.toString(), is(equalTo("[1, 2, 3, 4, 5]")));
  }

  @Test
  public void iteratorTestEmpty() {
    StringBuffer string = new StringBuffer();
    for (Object element : list) {
      string.append(element);
    }
    assertThat(string.toString(), is(""));
    Iterator iterator = list.iterator();
    string = iterate(iterator);
    assertThat(string.toString(), is(""));
  }

  private void addList() {
    for (int i = 1; i < 10; i++) {
      list.add(i);
    }
  }

  private StringBuffer iterate(Iterator iterator) {
    StringBuffer string = new StringBuffer();
    while (iterator.hasNext()) {
      Object current = iterator.next();
      string.append(current + " ");
    }
    return string;
  }

  @Test
  public void iteratorTestForEach() {
    StringBuffer string = new StringBuffer();
    addList();
    for (Object element : list) {
      string.append(element);
    }
    assertThat(string.toString(), is(equalTo("123456789")));
  }

  @Test
  public void iteratorTestList() {
    addList();
    Iterator iterator = list.iterator();
    StringBuffer string = iterate(iterator);
    assertThat(string.toString(), is(equalTo("1 2 3 4 5 6 7 8 9 ")));
  }

  @Test(expected = NoSuchElementException.class)
  public void removeTestException() {
    list.remove();
  }

  @Test
  public void removeTest() {
    for (int i = 1; i < 10; i++) {
      list.add(i);
      list.remove();
    }
    assertThat(list.toString(), is(""));
    list.add(1);
    list.remove();
    assertThat(list.toString(), is(""));
    addList();
    list.remove();
    assertThat(list.toString(), is(equalTo("[2, 3, 4, 5, 6, 7, 8, 9]")));
  }

  @Test(expected = IllegalArgumentException.class)
  public void addByPositionExceptionTest() {
    addList();
    list.addByPosition(7, 25);
  }

  @Test(expected = IllegalArgumentException.class)
  public void removeByPositionExceptionTest() {
    list.removeByPosition(0);
  }

  @Test
  public void addByPositionPositiveTest() {
    addList();
    list.addByPosition(17, 2);
    assertThat(list.toString(), is(equalTo("[1, 2, 17, 3, 4, 5, 6, 7, 8, 9]")));
  }

  @Test
  public void insertByPositionEmptyList() {
    list.addByPosition(17, 0);
    assertThat(list.toString(), is(equalTo("[17]")));
  }

  @Test
  public void addByPositionEqualCount() {
    addList();
    list.addByPosition(17, 9);
    assertThat(list.toString(), is(equalTo("[1, 2, 3, 4, 5, 6, 7, 8, 9, 17]")));
  }

  @Test
  public void removeByPositionTest() {
    addList();
    list.addByPosition(17, 2);
    list.removeByPosition(2);
    assertThat(list.toString(), is(equalTo("[1, 2, 3, 4, 5, 6, 7, 8, 9]")));
  }

  @Test
  public void getTest() {
    addList();
    assertThat(list.get(3), is(4));
  }

  @Test(expected = NoSuchElementException.class)
  public void getEmptyExceptionTest() {
    list.get(5);
  }

  @Test
  public void reverseGetTest() {
    addList();
    assertThat(list.reverseSearch(4), is(5));
  }

  @Test
  public void addCycleTest() {
    addList();
    list.addCycle(6);
    assertThat(list.hasCycle(), is(true));
  }
}
