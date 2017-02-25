package mail;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MailTest {

  Mail mail;
  Letter firstLetter;
  Letter secondLetter;
  Letter thirdLetter;

  @Before
  public void setUp() {
    mail = new Mail();
    firstLetter = new Letter("Rina", "First letter");
    secondLetter = new Letter("Alex", "Second letter");
    thirdLetter = new Letter("Ann", "Third letter");
  }

  @Test
  public void addInboxLetterTest() {
    mail.addInboxLetter(firstLetter);
    mail.addInboxLetter(secondLetter);
    mail.addInboxLetter(thirdLetter);
    assertThat(mail.getCounterInbox(), is(3));
  }

  @Test
  public void removeInboxLetterTest() {
    mail.addInboxLetter(firstLetter);
    mail.removeInboxLetter();
    assertThat(mail.getCounterInbox(), is(0));
  }


  @Test
  public void addOutboxLetterTest() {
    mail.addOutboxLetter(firstLetter);
    mail.addOutboxLetter(secondLetter);
    mail.addOutboxLetter(thirdLetter);
    assertThat(mail.getCounterOutbox(), is(3));
  }

  @Test
  public void removeOutboxLetterTest() {
    mail.addOutboxLetter(firstLetter);
    mail.removeOutboxLetter();
    assertThat(mail.getCounterOutbox(), is(0));
  }


}
