package com.hillel.tasks.ticketoffice;

import com.hillel.tasks.train.Train;
import org.junit.Before;
import org.junit.Test;

public class TicketOfficeTests {
  TicketOffice office;

  @Before
  public void setUp() {
    office = new TicketOffice();
  }

  @Test(expected = BookingIsImpossibleException.class)
  public void sellTicketInvalidCoachExceptionTest() throws BookingIsImpossibleException {
    office.sellTicket(new Train(1), 2, 1);
  }

  @Test(expected = BookingIsImpossibleException.class)
  public void sellTicketInvalidPlaceExceptionTest() throws BookingIsImpossibleException {
    office.sellTicket(new Train(1), 1, 37);
  }

  @Test(expected = BookingIsImpossibleException.class)
  public void sellTicketPlaceIsBusyExceptionTest() throws BookingIsImpossibleException {
    Train train = new Train(2);
    office.sellTicket(train, 2, 1);
    office.sellTicket(train, 2, 1);
  }

  @Test(expected = BookingIsImpossibleException.class)
  public void sellTicketTrainIsFullExceptionTest() throws BookingIsImpossibleException {
    Train train = new Train(3);
    sellAllTicket(train);
    office.sellTicket(train, 1, 5);
  }

  private void sellAllTicket(Train train) throws BookingIsImpossibleException {
    for (int i = 0; i < train.getLength(); i++) {
      for (int j = 0; j < train.getCoachCapacity(i + 1); j++) {
        office.sellTicket(train, i + 1, j + 1);
      }
    }
  }
}
