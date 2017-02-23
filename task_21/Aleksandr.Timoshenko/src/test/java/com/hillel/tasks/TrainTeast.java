package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TrainTeast {

  Train train;

  @Before
  public void setUp() {
    train = new Train(3);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void isTicketInStockTest() {
    assertThat(train.isTicketInStock(4, 4), is(4));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void isTicketInStockTestToo() {
    assertThat(train.isTicketInStock(2, 44), is(4));
  }

  @Test
  public void isTicketInStockTestThree() {
    boolean result = train.isTicketInStock(2, 4);
    assertThat(result, is(true));
  }

  @Test
  public void isTicketInStockTestFour() throws NoTicketException {
    train.soldTicket(2, 4);
    boolean result = train.isTicketInStock(2, 4);
    assertThat(result, is(false));
  }

  @Test(expected = NoTicketException.class)
  public void isTicketInStockTestFive() throws NoTicketException {
    try {
      train.soldTicket(2, 4);
      train.soldTicket(2, 4);
    } catch (NoTicketException e) {
      throw new NoTicketException(e.getMessage());
    }
  }

  @Test
  public void getNumberSoldTicketsTest() throws NoTicketException {
    try {
      train.soldTicket(2, 1);
      train.soldTicket(2, 2);
      train.soldTicket(2, 3);
      assertThat(train.getNumberSoldTickets(), is(3));
    } catch (NoTicketException e) {
      throw new NoTicketException(e.getMessage());
    }

  }


}
