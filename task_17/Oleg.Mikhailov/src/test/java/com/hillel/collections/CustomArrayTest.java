package com.hillel.collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;

public class CustomArrayTest {

  CustomList clearList;
  CustomList list;

  @Before
  public void setUp() {
    clearList = new CustomArrayList();
    list = new CustomArrayList();
    list.add("adasd");
    list.add("ad");
    list.add("ololo");
    list.add("olo");
  }

  @Test(expected = NoSuchElementException.class)
  public void testIndexOf() {
    clearList.indexOf("asdad");
  }

  @Test
  public void testEmpty() {
    assertThat(clearList.isEmpty(), is(true));
    clearList.add("olololo");
    assertThat(clearList.isEmpty(), is(false));
  }

  @Test
  public void testSize() {
    assertThat(list.size(), is(4));
  }

  @Test
  public void testContains() {
    assertThat(list.contains("ad"), is(true));
  }

  @Test
  public void testGet() {
    assertThat(list.get(4), is("olo"));
  }

  @Test(expected = NullPointerException.class)
  public void testIncorrectInput() {
    list.get(0);
  }

  @Test
  public void testExtendedAdd() {
    clearList.add(2, "ololo");
    boolean realResult = clearList.get(2).equals("ololo");
    assertThat(realResult, is(true));
  }

  @Test
  public void testAdd() {
    clearList.add("olol");
    clearList.add("ool");
    assertThat(clearList.get(1), is("olol"));
    assertThat(clearList.get(2), is("ool"));
  }

  @Test
  public void testRemoveElement() {
    list.remove("ad");
    assertThat(list.size(), is(3));
  }

  @Test
  public void testRemoveIndex() {
    list.remove(2);
    list.remove(3);
    assertThat(list.size(), is(2));
  }

  @Test
  public void testClear() {
    list.clear();
    assertThat(list.size(), is(0));
  }

}
