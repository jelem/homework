package com.hillel.fleshlight;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FlashlightTest {

  String light;
  Flashlight flashlight;


  @Before
  public void setUp() {
    flashlight = new Flashlight();
  }

  @Test
  public void testIsShine() {
    assertThat(flashlight.isShine(), is(false));

    flashlight.insertBattery();

    assertThat(flashlight.isShine(), is(true));
  }

  @Test
  public void testLigthType() {
    light = flashlight.lightType();
    assertThat(light, is("The flashlight does not shine"));

    flashlight.insertBattery();

    light = flashlight.lightType();
    assertThat(light, is("The flashlight shines white light"));

    flashlight.insertBattery();

    light = flashlight.lightType();
    assertThat(light, is("The flashlight shines red light"));

    flashlight.insertBattery();

    light = flashlight.lightType();
    assertThat(light, is("The flashlight blinking"));

    flashlight.insertBattery();

    light = flashlight.lightType();
    assertThat(light, is("The flashlight blinking"));
  }

  @Test
  public void testInsertBattery() {

    assertThat(flashlight.getBattery(), is(0));

    flashlight.insertBattery();

    assertThat(flashlight.getBattery(), is(1));

    flashlight.insertBattery();

    assertThat(flashlight.getBattery(), is(2));

    flashlight.insertBattery();

    assertThat(flashlight.getBattery(), is(3));

    flashlight.insertBattery();

    assertThat(flashlight.getBattery(), is(3));
  }
}