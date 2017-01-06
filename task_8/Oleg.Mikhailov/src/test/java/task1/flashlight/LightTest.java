package task1.flashlight;


import objects.*;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static sun.nio.cs.Surrogate.is;


public class LightTest {

    Flashlight flashlight;

    @Before
    public void setUp() {
        flashlight = new Flashlight();
    }

    @Test

    public void testInsertBattery() {
        assertThat(flashlight.getBatteries(), Is.is(0));

        flashlight.insertBattery();
        Assert.assertThat(flashlight.getBatteries(), Is.is(1));


        for (int i = 0; i < 5; i++) {
            flashlight.insertBattery();
        }
        assertThat(flashlight.getBatteries(), Is.is(3));
    }

    @Test
    public void testShine() {
        flashlight.insertBattery();
        Assert.assertThat(flashlight.getShines(), Is.is(true));

    }

    @Test
    public void testLightMode1() {
        flashlight.insertBattery();
        flashlight.lightModeWhite();
        Assert.assertThat(flashlight.getStatusMode(), Is.is(1));
    }
    @Test
    public void testLightMode2() {
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.lightModeRed();
        Assert.assertThat(flashlight.getStatusMode(), Is.is(2));
    }
    @Test
    public void testLightMode3() {
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.lightModeBlink();
        Assert.assertThat(flashlight.getStatusMode(), Is.is(3));
    }


}


