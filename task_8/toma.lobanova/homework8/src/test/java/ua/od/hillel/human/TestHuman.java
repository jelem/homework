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
  public void testName() {
    human.setName("Ivan");
    String result = human.getName();
    assertThat(result, is("Ivan"));
    human.setName(null);
    result = human.getName();
    assertThat(result, is("Ivan"));
  }

  @Test
  public void testSurname() {
    human.setSurname("Petrov");
    String result = human.getSurname();
    assertThat(result, is("Petrov"));
    human.setSurname(null);
    result = human.getSurname();
    assertThat(result, is("Petrov"));
  }

  @Test
  public void testStatus() {
    boolean status = human.getMarriageStatus();
    assertThat(status, is(false));
    human.setMarriageStatus(true);
    status = human.getMarriageStatus();
    assertThat(status, is(true));
  }

  @Test
  public void testWork() {
    boolean status = human.getWorkStatus();
    assertThat(status, is(false));
    human.setWorkStatus(true);
    status = human.getWorkStatus();
    assertThat(status, is(true));
  }

  @Test
  public void testCompanyName() {
    human.setCompanyName("DataArt");
    String result = human.getCompanyName();
    assertThat(result, is("DataArt"));
    human.setCompanyName(null);
    result = human.getCompanyName();
    assertThat(result, is("DataArt"));
  }

  @Test
  public void testChildrenStatus() {
    boolean status = human.getChildrenStatus();
    assertThat(status, is(false));
    human.setChildrenStatus(true);
    status = human.getChildrenStatus();
    assertThat(status, is(true));
  }

  @Test
  public void testValidBirthday() {
    GregorianCalendar result = human.getBirthday();
    GregorianCalendar birthday = new GregorianCalendar(1975, Calendar.DECEMBER, 31);
    assertThat(result, is(birthday));
    human.setBirthday(1987, Calendar.JANUARY, 1);
    result = human.getBirthday();
    birthday = new GregorianCalendar(1987, Calendar.JANUARY, 1);
    assertThat(result, is(birthday));
  }

  @Test
  public void testInvalidBirthday() {
    human.setBirthday(1989, Calendar.FEBRUARY, 31);
    GregorianCalendar result = human.getBirthday();
    GregorianCalendar birthday = new GregorianCalendar(1989, Calendar.FEBRUARY, 31);
    assertThat(result, is(birthday));
  }
}
