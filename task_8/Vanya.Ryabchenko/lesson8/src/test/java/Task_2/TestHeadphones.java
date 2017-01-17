package Task_2;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestHeadphones {

  Headphones headphones;

  @Before
  public void setUp() {
    headphones = new Headphones();
  }

  @Test
  public void testConnecting() {
    headphones.connecting();
    assertThat(headphones.getConnect(), is(true));
  }

  @Test
  public void testDisconnecting() {
    headphones.disconecting();
    assertThat(headphones.getConnect(), is(false));
  }

  @Test
  public void testTurnWheelUpOne() {
    headphones.turnWheelUp();
    assertThat(headphones.getNumberOfTurnWheel(), is(1));
  }

  @Test
  public void testTurnWheelUpFive() {
    for (int i = 0; i < 5; i++) {
      headphones.turnWheelUp();
    }

    assertThat(headphones.getNumberOfTurnWheel(), is(5));
  }

  @Test
  public void testTurnWheelUpTen() {
    for (int i = 0; i < 10; i++) {
      headphones.turnWheelUp();
    }

    assertThat(headphones.getNumberOfTurnWheel(), is(10));
  }

  @Test
  public void testTurnWheelUpMany() {
    for (int i = 0; i < 20; i++) {
      headphones.turnWheelUp();
    }

    assertThat(headphones.getNumberOfTurnWheel(), is(10));
  }

  @Test
  public void testTurnWheelDownOne() {
    for (int i = 0; i < 5; i++) {
      headphones.turnWheelUp();
    }
    headphones.turnWheelDown();
    assertThat(headphones.getNumberOfTurnWheel(), is(4));

  }

  @Test
  public void testTurnWheelDownMany() {
    for (int i = 0; i < 5; i++) {
      headphones.turnWheelUp();
    }
    for (int i = 0; i < 10; i++) {
      headphones.turnWheelDown();
    }

    assertThat(headphones.getNumberOfTurnWheel(), is(0));

  }

  @Test
  public void testVolume() {
    for (int i = 0; i < 5; i++) {
      headphones.turnWheelUp();
    }
    headphones.Volume();
    assertThat(headphones.getVolume(), is(50));
  }

  @Test
  public void testVolumeWithManyTurnWheel() {
    for (int i = 0; i < 20; i++) {
      headphones.turnWheelUp();
    }
    headphones.Volume();
    assertThat(headphones.getVolume(), is(100));
  }
}
