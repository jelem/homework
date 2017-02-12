package com.hillel.linkedlist;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class CustomLinkedListTests {
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
  public void iteratorTestEmptyList() {
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
  public void iteratorTestForEachNotEmptyList() {
    StringBuffer string = new StringBuffer();
    addList();
    for (Object element : list) {
      string.append(element);
    }
    assertThat(string.toString(), is(equalTo("123456789")));
  }

  @Test
  public void iteratorTestNotEmptyList() {
    addList();
    Iterator iterator = list.iterator();
    StringBuffer string = iterate(iterator);
    assertThat(string.toString(), is(equalTo("1 2 3 4 5 6 7 8 9 ")));
  }

  @Test(expected = EmptyStackException.class)
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
  public void insertByPositionExceptionTest() {
    addList();
    list.insertByPosition(7, 25);
  }

  @Test(expected = IllegalArgumentException.class)
  public void removeByPositionExceptionTest() {
    list.removeByPosition(0);
  }

  @Test
  public void insertByPositionPositiveTest() {
    addList();
    list.insertByPosition(777, 2);
    assertThat(list.toString(), is(equalTo("[1, 2, 777, 3, 4, 5, 6, 7, 8, 9]")));
  }

  @Test
  public void insertByPositionEmptyList() {
    list.insertByPosition(9, 0);
    assertThat(list.toString(), is(equalTo("[9]")));
  }

  @Test
  public void insertByPositionEqualCount() {
    addList();
    list.insertByPosition(10, 9);
    assertThat(list.toString(), is(equalTo("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]")));
  }

  @Test
  public void removeByPositionPositiveTest() {
    addList();
    list.insertByPosition(777, 2);
    list.removeByPosition(2);
    assertThat(list.toString(), is(equalTo("[1, 2, 3, 4, 5, 6, 7, 8, 9]")));
  }

  @Test
  public void removeByPositionPositiveOneElementTest() {
    list.add(1);
    list.removeByPosition(0);
    assertThat(list.toString(), is(""));
  }


  @Test
  public void getTest() {
    addList();
    assertThat(list.get(3), is(4));
  }

  @Test(expected = EmptyStackException.class)
  public void getEmptyExceptionTest() {
    list.get(5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void getInvalidPositionExceptionTest() {
    addList();
    list.get(25);
  }

  @Test
  public void reverseGetTest() {
    addList();
    assertThat(list.reverseSearch(4), is(5));
  }

  @Test
  public void introduceCycleTest() {
    addList();
    list.introduceCycle(6);
    assertThat(list.hasCycle(), is(true));
  }
}
