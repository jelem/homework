package task1.flashlight;



import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;


public class LightTest {

    Flashlight flashlight;

    @Before
    public void setUp() {
        flashlight = new Flashlight();
    }

    @Test

    public void testInsertBattery() {
        assertThat(flashlight.getBatteries(), is(0));

        flashlight.insertBattery();
        assertThat(flashlight.getBatteries(), is(1));


        for (int i = 0; i < 5; i++) {
            flashlight.insertBattery();
        }
        assertThat(flashlight.getBatteries(), is(3));
    }

    @Test
    public void testShine() {
        flashlight.insertBattery();
        assertThat(flashlight.getShines(), is(true));

    }

    @Test
    public void testLightMode1() {
        flashlight.insertBattery();
        flashlight.lightModeWhite();
        assertThat(flashlight.getStatusMode(), is(1));
    }
    @Test
    public void testLightMode2() {
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.lightModeRed();
        assertThat(flashlight.getStatusMode(), is(2));
    }
    @Test
    public void testLightMode3() {
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.insertBattery();
        flashlight.lightModeBlink();
        assertThat(flashlight.getStatusMode(), is(3));
    }


}


