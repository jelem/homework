package task2.signaling;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SignalingTest {
    Signaling signaling;

    @Before
    public void setUp() {
        signaling = new Signaling();
    }

    @Test

    public void testStatusSignaling() {
        signaling.setPower();
        Assert.assertThat(signaling.getPower(), Is.is(true));

        signaling.setPower();
        Assert.assertThat(signaling.getPower(), Is.is(false));
    }

    @Test
    public void testCorrectPass() {
        signaling.password = "123";
        signaling.getPass();
        Assert.assertThat(signaling.getPassword(), Is.is(false));

        signaling.password = "1234";
        signaling.getPass();
        Assert.assertThat(signaling.getPassword(), Is.is(true));
    }

    @Test
    public void attemptsOfInputPass() {
        signaling.password = "123";
        for (int i = 0; i < 5; i++) {
            signaling.getPass();
        }
        signaling.password = "1234";
        signaling.getPass();
        Assert.assertThat(signaling.getPassword(), Is.is(false));



    }



}
