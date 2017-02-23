package com.hillel.collections;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CustomListTest {

  CustomList<String> list;

  @Before
  public void setUp() {
    list = new CustomList<>();
  }

  @Test
  public void addTest() {
    list.add("a");
    list.add("b");
    list.add("c");
    assertThat(list.peek(), is("a"));
  }

  @Test
  public void getCounterTest() {
    list.add("a");
    list.add("b");
    list.add("c");
    assertThat(list.getCounter(), is(3));
  }

  @Test
  public void foundValueTest() {
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    assertThat(list.foundValue(3), is("d"));
  }

  @Test
  public void hasCycleTrueTest() {
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.introduceCycle(3);
    assertThat(list.hasCycle(), is(true));
  }

  @Test
  public void hasCycleFalseTest() {
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    assertThat(list.hasCycle(), is(false));
  }
}

  


