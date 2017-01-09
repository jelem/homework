package com.hillel.flashlight;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FlashlightTest {

    @Test
    public void testFlashlight() {
        Flashlight flashlight = new Flashlight();
        flashlight.setName("testFlashlight");
        System.out.println(flashlight.getName());
        assertThat(flashlight.getBatteries(), is(0));
        assertThat(flashlight.isShines(), is(false));

        for (int i = 0; i < Flashlight.MAXIMUX_BATTERIES; i++) {
            flashlight.insertBatteries();
            flashlight.setColor(i + 1);
            System.out.println("Status " + flashlight.isShines());
            System.out.println("Color " + flashlight.getColor());
            System.out.println("Batteries number " + flashlight.getBatteries());
        }

    }
}
