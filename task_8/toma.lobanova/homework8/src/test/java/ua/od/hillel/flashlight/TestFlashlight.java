package ua.od.hillel.flashlight;

import com.sun.javafx.sg.prism.NGShape;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestFlashlight {
    Flashlight flashlight;

    @Before
    public void setUp() {
        flashlight = new Flashlight();
    }

    @Test
    public void TestSetBatteriesNormalWasEmpty() {
        flashlight.setBatteries(2);
        int result = flashlight.getBatteries();
        assertThat(result, is(2));
    }

    @Test
    public void TestSetBatteriesMoreMaxWasEmpty() {
        flashlight.setBatteries(10);
        int result = flashlight.getBatteries();
        assertThat(result, is(3));
    }

    @Test
    public void TestSetBatteriesLessMaxWasNotEmpty() {
        flashlight.setBatteries(1);
        flashlight.setBatteries(1);
        int result = flashlight.getBatteries();
        assertThat(result, is(2));
    }

    @Test
    public void TestSetMode() {
        flashlight.setBatteries(2);
        flashlight.setMode(ModeLight.BLINK);
        ModeLight result = flashlight.getMode();
        assertThat(result, is(ModeLight.NOLIGHT));
        flashlight.setMode(ModeLight.REDLIGHT);
        result = flashlight.getMode();
        assertThat(result, is(ModeLight.REDLIGHT));
        flashlight.setMode(ModeLight.BLINK);
        result = flashlight.getMode();
        assertThat(result, is(ModeLight.REDLIGHT));
    }

    @Test
    public void TestNaming(){
        String result = flashlight.getName();
        assertThat(result, is("flash"));
        flashlight.setName("RocketMan");
        result = flashlight.getName();
        assertThat(result, is("RocketMan"));
        flashlight.setName(null);
        result = flashlight.getName();
        assertThat(result, is("RocketMan"));
    }

    @Test
    public void TestONOFF(){
        flashlight.putOnOff(Status.ON);
        Status resultStatus=flashlight.getStatus();
        assertThat(resultStatus, is(Status.OFF));
        ModeLight resultMode=flashlight.getMode();
        assertThat(resultMode, is(ModeLight.NOLIGHT));
    }

    @Test
    public void TestONOFFWhenRedLight(){
        flashlight.setBatteries(3);
        flashlight.setMode(ModeLight.REDLIGHT);
        flashlight.putOnOff(Status.OFF);
        ModeLight mode = flashlight.getMode();
        Status status = flashlight.getStatus();
        assertThat(mode, is(ModeLight.NOLIGHT));
        assertThat(status, is(Status.OFF));
    }
}
