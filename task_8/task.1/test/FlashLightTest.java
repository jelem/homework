package com.FlashLight;

import com.objects.FlashLight;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ANN on 29.12.2016.
 */
public class FlashLightTest {
    @Test
    public void testFlashLight() {
        System.out.println("Fonarik");
        FlashLight flashLight  = new FlashLight();
        //flashLight.setColor(FlashLight.WHITE_COLOR);
        assertThat(flashLight.getBatteries(), is(0));
        assertThat(flashLight.isShines(), is(false));

        //flashLight.insertBattary();

        assertThat(flashLight.getBatteries(), is(0));
        //assertThat(flashLight.getBatteries(), is(true));
        //assertThat(flashLight.getColor(), is(FlashLight.WHITE_COLOR));

        for (int i = 0; i < FlashLight.MAXIMUM_BATTERIES ; i++) {
            flashLight.insertBattary();
            flashLight.checkColor();
        }

//        assertThat(flashLight.getBatteries(), is(3));
//        assertThat(flashLight.getBatteries(), is(true));
//        assertThat(flashLight.getColor(), is(true));





    }
    }
