package com.hillel.fleshlight;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HumanTest {

  Human human;

  @Before
  public void setUp() {
    human = new Human();
  }

  @Test
  public void testGetMoneyForWhell() {
    assertThat(human.getMoney(), is(100));

    human.payForWheel();

    assertThat(human.getMoney(), is(90));

    human.payForWheel();

    assertThat(human.getMoney(), is(80));

    human.payForWheel();

    assertThat(human.getMoney(), is(70));

    human.payForWheel();

    assertThat(human.getMoney(), is(60));

    human.payForWheel();

    assertThat(human.getMoney(), is(60));
  }

  @Test
  public void testGetMoneyForFuil() {
    assertThat(human.getMoney(), is(100));

    human.payForFuil();

    assertThat(human.getMoney(), is(80));

    human.payForFuil();

    assertThat(human.getMoney(), is(60));

    human.payForFuil();

    assertThat(human.getMoney(), is(40));

    human.payForFuil();

    assertThat(human.getMoney(), is(40));
  }

  @Test
  public void testIsHumanAtWork() {
    assertThat(human.isAtWork(), is(false));
    human.payForWheel();
    human.payForWheel();
    human.payForWheel();
    human.payForWheel();
    human.payForFuil();
    human.payForFuil();
    human.payForFuil();
    assertThat(human.isAtWork(), is(true));
  }
}