package ticketselling;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestTrainExceptions {

  private Train trainOdessa;

  @Before
  public void setUp() throws NoTicketException {
    trainOdessa = new Train();
    trainOdessa.getWagon(0).buyPlace(10);
  }

  @Test
  public void testNoFullWagon() {
    assertThat(trainOdessa.getWagon(1).isFull(), is(false));
  }

  @Test
  public void testBuyPlace()
      throws NoTicketException {
    trainOdessa.getWagon(1).buyPlace(2);
    assertThat(trainOdessa.getWagon(1).getPlace(2), is(true));
  }

  @Test
  public void testFullWagon()
      throws NoTicketException {
    for (int i = 0; i < 36; i++) {
      trainOdessa.getWagon(1).buyPlace(i);
    }
    assertThat(trainOdessa.getWagon(1).isFull(), is(true));
  }

  @Test(expected = NoTicketException.class)
  public void testNoTicketException() throws NoTicketException {
    trainOdessa.getWagon(0).buyPlace(10);
  }

  @Test(expected = NoTicketException.class)
  public void testReturnNoTicketException() throws NoTicketException {
    trainOdessa.getWagon(1).returnPlace(2);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testBuyTicketIndexBound() throws NoTicketException {
    trainOdessa.getWagon(1).buyPlace(40);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testReturnIndexOfBound() throws NoTicketException {
    trainOdessa.getWagon(1).returnPlace(38);
  }

}
