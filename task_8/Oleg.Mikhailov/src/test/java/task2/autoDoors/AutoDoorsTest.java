package task2.autoDoors;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AutoDoorsTest {

     AutoDoors doors;

    @Before
    public void setUp() {
        doors = new AutoDoors();
    }

    @Test
    public void testStatusDoors() {
        doors.personOutside();
        Assert.assertThat(doors.statusOutside(), Is.is(true));
        Assert.assertThat(doors.statusInside(), Is.is(false));

        doors.personInside();
        Assert.assertThat(doors.statusOutside(), Is.is(false));
        Assert.assertThat(doors.statusInside(), Is.is(true));
    }

    @Test
    public void testCounter() {
        for (int i = 0; i < 5; i++) {
            doors.personOutside();
        }
        for (int i = 3; i > 0; i--) {
            doors.personInside();
        }

        Assert.assertThat(doors.getCount(), Is.is(2));


    }


}
