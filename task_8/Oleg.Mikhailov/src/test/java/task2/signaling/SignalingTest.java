package task2.signaling;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;



public class SignalingTest {
    Signaling signaling;

    @Before
    public void setUp() {
        signaling = new Signaling();
    }

    @Test

    public void testStatusSignaling() {
        signaling.setPower();
        assertThat(signaling.getPower(), is(true));

        signaling.setPower();
        assertThat(signaling.getPower(), is(false));
    }

    @Test
    public void testCorrectPass() {


        signaling.getPass();
        assertThat(signaling.getPassword(), is(true));
    }

    @Test
    public void attemptsOfInputPass() {
        for (int i = 0; i < 5; i++) {
            signaling.getPass();
        }
        signaling.getPass();
        assertThat(signaling.getPassword(), is(true));



    }



}
