package ua.od.hillel.human;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestHuman {
    Human human;

    @Before
    public void setUp() {
        human = new Human();
    }

    @Test
    public void TestName() {
        human.setName("Ivan");
        String result = human.getName();
        assertThat(result, is("Ivan"));
        human.setName(null);
        result = human.getName();
        assertThat(result, is("Ivan"));
    }

    @Test
    public void TestSurname() {
        human.setSurname("Petrov");
        String result = human.getSurname();
        assertThat(result, is("Petrov"));
        human.setSurname(null);
        result = human.getSurname();
        assertThat(result, is("Petrov"));
    }

    @Test
    public void TestStatus() {
        boolean status = human.getMarriageStatus();
        assertThat(status, is(false));
        human.setMarriageStatus(true);
        status = human.getMarriageStatus();
        assertThat(status, is(true));
    }

    @Test
    public void TestWork() {
        boolean status = human.getWorkStatus();
        assertThat(status, is(false));
        human.setWorkStatus(true);
        status = human.getWorkStatus();
        assertThat(status, is(true));
    }

    @Test
    public void TestCompanyName() {
        human.setCompanyName("DataArt");
        String result = human.getCompanyName();
        assertThat(result, is("DataArt"));
        human.setCompanyName(null);
        result = human.getCompanyName();
        assertThat(result, is("DataArt"));
    }

    @Test
    public void TestChildrenStatus() {
        boolean status = human.getChildrenStatus();
        assertThat(status, is(false));
        human.setChildrenStatus(true);
        status = human.getChildrenStatus();
        assertThat(status, is(true));
    }

    @Test
    public void TestValidBirthday() {
        GregorianCalendar result = human.getBirthday();
        GregorianCalendar birthday = new GregorianCalendar(1975, Calendar.DECEMBER, 31);
        assertThat(result, is(birthday));
        human.setBirthday(1987, Calendar.JANUARY, 1);
        result = human.getBirthday();
        birthday = new GregorianCalendar(1987, Calendar.JANUARY, 1);
        assertThat(result, is(birthday));
    }

    @Test
    public void TestInvalidBirthday() {
        human.setBirthday(1989, Calendar.FEBRUARY, 31);
        GregorianCalendar result = human.getBirthday();
        GregorianCalendar birthday = new GregorianCalendar(1989, Calendar.FEBRUARY, 31);
        assertThat(result, is(birthday));
    }
}
