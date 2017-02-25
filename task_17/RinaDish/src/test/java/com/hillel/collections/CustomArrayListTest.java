package com.hillel.collections;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;

public class CustomArrayListTest {

  CustomList customList;

  @Before
  public void setUp() {
    customList = new CustomArrayList();
  }

  @Test(expected = NoSuchElementException.class)
  public void testRemoval() {
    CustomList list = new CustomArrayList();
    list.indexOf("asdfsf");
  }

  @Test
  public void sizeTest() {
    customList.add("gfds");
    customList.add("jnds,.");
    customList.add("fdmkdkl");
    assertThat(customList.size(), is(3));
  }

  @Test
  public void isEmptyTest() {
    assertThat(customList.isEmpty(), is(true));
  }

  @Test
  public void isEmptySecondTest() {
    customList.add("just something");
    assertThat(customList.isEmpty(), is(false));
  }

  @Test
  public void containsTest() {
    customList.add("nothing");
    customList.add("nothing");
    customList.add("just something");
    customList.add("anything");
    assertThat(customList.contains("just something"), is(true));
  }

  @Test
  public void containsSecondTest() {
    customList.add("nothing");
    customList.add("nothing");
    customList.add("just something");
    customList.add("anything");
    assertThat(customList.contains("something"), is(false));
  }

  @Test
  public void removeTest() {
    customList.add("nothing");
    customList.add("nothing");
    customList.add("just something");
    customList.add("anything");
    int index = 3;
    assertThat(customList.remove(index), is("just something"));
  }

  @Test
  public void clearTest() {
    customList.add("nothing");
    customList.add("nothing");
    customList.add("just something");
    customList.add("anything");
    customList.clear();
    assertThat(customList.size(), is(0));
  }

  @Test
  public void getTest() {
    customList.add("nothing");
    customList.add("nothing");
    customList.add("just something");
    customList.add("anything");

    assertThat(customList.get(1), is("nothing"));
  }

}
