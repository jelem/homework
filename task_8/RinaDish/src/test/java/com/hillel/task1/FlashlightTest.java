package com.hillel.task1;

import com.hillel.task1.Flashlight;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FlashlightTest {
    Flashlight flashlight;

    @Before

    public void setUp() {
        flashlight = new Flashlight();
    }

    @Test
    public void colorTest0() {

        flashlight.color();
        assertThat(flashlight.getColor(), is("Not color"));
    }

    @Test
    public void colorTest1() {
        flashlight.insertBattery();
        flashlight.color();
        assertThat(flashlight.getColor(), is("White"));
    }

    @Test
    public void colorTest2() {
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.color();
        assertThat(flashlight.getColor(), is("Red"));
    }

    @Test
    public void colorTest3() {
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.color();
        assertThat(flashlight.getColor(), is("Blink"));
    }

    @Test
    public void insertTest0() {

        assertThat(flashlight.getBatteries(), is(0));
    }

    @Test
    public void insertTest1() {
        flashlight.insertBattery();
        assertThat(flashlight.getBatteries(), is(1));
    }

    @Test
    public void insertTest2() {
        flashlight.insertBattery();
        flashlight.insertBattery();
        assertThat(flashlight.getBatteries(), is(2));
    }

    @Test
    public void insertTest3() {
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.insertBattery();
        assertThat(flashlight.getBatteries(), is(3));
    }
}
