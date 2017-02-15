package com.lessons.collections;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;

public class CustomArrayListTest {

  CustomList list;

  @Before
  public void setUp() {
    list = new CustomArrayList();
  }

  @Test(expected = NoSuchElementException.class)
  public void testRemoval() {
    list.indexOf("asdfds");
  }

  @Test
  public void sizeTest() {
    list.add("gfh");
    list.add("sdg");
    list.add("eg");
    list.add("sg");
    list.add("sdg");
    assertThat(list.size(), is(5));
  }

  @Test
  public void isEmptyTest1() {
    assertThat(list.isEmpty(), is(true));
  }

  @Test
  public void isEmptyTest2() {
    list.add("eg");
    assertThat(list.isEmpty(), is(false));
  }

  @Test
  public void containsTest1() {
    list.add("eg");
    list.add("sg");
    list.add("sdg");
    assertThat(list.contains("sg"), is(true));
  }

  @Test
  public void containsTest2() {
    list.add("eg");
    list.add("sg");
    list.add("sdg");
    assertThat(list.contains("ss"), is(false));
  }

  @Test
  public void removeTest() {
    list.add("eg");
    list.add("sg");
    list.add("sdg");
    list.remove("sg");
    assertThat(list.size(), is(2));
  }

  @Test
  public void clearTest() {
    list.add("eg");
    list.add("sg");
    list.add("sdg");
    list.clear();
    assertThat(list.size(), is(0));
  }

  @Test(expected = NoSuchElementException.class)
  public void getTest1() {
    list.add("eg");
    list.add("sg");
    list.add("sdg");
    list.get(7);
  }

  @Test
  public void getTest2() {
    list.add("eg");
    list.add("sg");
    list.add("sdg");
    assertThat(list.get(1), is("eg"));
  }
}

