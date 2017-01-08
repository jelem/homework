package task2.autoDoors;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
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
        assertThat(doors.statusOutside(), is(true));
        assertThat(doors.statusInside(), is(false));

        doors.personInside();
        assertThat(doors.statusOutside(), is(false));
        assertThat(doors.statusInside(), is(true));
    }

    @Test
    public void testCounter() {
        for (int i = 0; i < 5; i++) {
            doors.personOutside();
        }
        for (int i = 3; i > 0; i--) {
            doors.personInside();
        }

        assertThat(doors.getCount(), is(2));


    }


}
