package Task_1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FlashlightTest {

  Flashlight flashlight;

  @Before
  public void createFlashlight() {
    flashlight = new Flashlight();
  }

  @Test
  public void testInsertBattery() {

    assertThat(flashlight.getBattery(), is(0));
    flashlight.insertBattery();
    assertThat(flashlight.getBattery(), is(1));
    for (int i = 0; i < 10; i++) {
      flashlight.insertBattery();
    }

    assertThat(flashlight.getBattery(), is(3));
  }

  @Test
  public void testColorWhite() {
    flashlight.insertBattery();
    flashlight.color();
    assertThat(flashlight.getColor(), is("white"));
  }

  @Test
  public void testColorRed() {

    flashlight.insertBattery();
    flashlight.insertBattery();
    flashlight.color();
    assertThat(flashlight.getColor(), is("red"));

  }

  @Test
  public void testColorBlink() {
    for (int i = 0; i < 10; i++) {
      flashlight.insertBattery();
    }

    flashlight.color();
    assertThat(flashlight.getColor(), is("blink"));
  }

  @Test
  public void testFalseShines() {
    flashlight.shine();
    assertThat(flashlight.getShines(), is(false));
  }

  @Test
  public void testTrueShines() {
    for (int i = 0; i < 10; i++) {
      flashlight.insertBattery();
      flashlight.shine();
      assertThat(flashlight.getShines(), is(true));
    }
  }

}
