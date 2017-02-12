package com.lessons.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CustomArrayListTests {
  CustomList list;

  @Before
  public void setUP() {
    list = new CustomArrayList();
  }

  @Test
  public void sizeTest() {
    int actualSize = list.size();
    assertThat(actualSize, is(0));
    CustomList listSecond = new CustomArrayList(2);
    actualSize = listSecond.size();
    assertThat(actualSize, is(0));
  }

  @Test
  public void capacityTest() {
    int actualCapacity = list.capacity();
    assertThat(actualCapacity, is(10));
    CustomList listSecond = new CustomArrayList(2);
    actualCapacity = listSecond.capacity();
    assertThat(actualCapacity, is(10));
  }

  @Test
  public void isEmptyTest() {
    assertThat(list.isEmpty(), is(true));
    CustomList listSecond = new CustomArrayList(2);
    assertThat(listSecond.isEmpty(), is(true));
  }

  @Test
  public void containsTest() {
    assertThat(list.contains("element"), is(false));
  }

  @Test
  public void addTest() {
    list.add("first");
    assertThat(list.contains("first"), is(true));
    assertThat(list.isEmpty(), is(false));
    list.add(0, "newfirst");
    assertThat(list.contains("newfirst"), is(true));
  }

  @Test(expected = NoSuchElementException.class)
  public void indexOfTestException() {
    list.indexOf("element");
  }

  @Test
  public void indexOfTestPositive() {
    list.add("meow");
    list.add(0, "cat");
    list.add(1, "says");
    assertThat(list.indexOf("says"), is(1));
  }

  @Test
  public void removeTestPositive() {
    list.add("first");
    list.add("second");
    list.add("third");
    list.remove("first");
    assertThat(list.contains("first"), is(false));
    list.remove(1);
    assertThat(list.contains("third"), is(false));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void removeTestNoIndexException() {
    list.remove(-1);
  }

  @Test(expected = NoSuchElementException.class)
  public void removeTestNoElementException() {
    list.remove("element");
  }

  @Test
  public void getTest() {
    list.add(0, "element");
    assertThat(list.get(0), is(equalTo("element")));
  }

  @Test
  public void generalBehaviorProgramTest() {
    assertThat(list.contains("element"), is(false));
    list.add("first");
    assertThat(list.contains("first"), is(true));
    assertThat(list.capacity(), is(10));
    list.add("second");
    assertThat(list.size(), is(2));
    assertThat(list.capacity(), is(10));
    list.add("third");
    assertThat(list.size(), is(3));
    assertThat(list.capacity(), is(10));
    list.add("forth");
    list.add("fifth");
    list.add("sixth");
    list.add("seventh");
    list.add("eight");
    list.add("ninth");
    list.add("tenth");
    assertThat(list.size(), is(10));
    assertThat(list.capacity(), is(10));
    list.add("eleventh");
    assertThat(list.size(), is(11));
    assertThat(list.capacity(), is(20));
    list.add(0, "zero");
    assertThat(list.indexOf("zero"), is(0));
    list.remove("zero");
    list.remove("first");
    list.remove("second");
    list.remove("third");
    list.remove("forth");
    list.remove("fifth");
    assertThat(list.size(), is(6));
    assertThat(list.capacity(), is(20));
    list.remove(0);
    assertThat(list.size(), is(5));
    assertThat(list.capacity(), is(20));
    list.remove(0);
    assertThat(list.size(), is(4));
    assertThat(list.capacity(), is(10));
    list.clear();
    assertThat(list.size(), is(0));
    assertThat(list.capacity(), is(10));
  }
}
