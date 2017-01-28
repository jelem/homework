package mailbox;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MailboxTest {

  private Mailbox mailbox;
  private Message message;

  @Before
  public void setUp() {
    this.mailbox = new Mailbox();
    this.message = new Message("Заголовок", "Описание сообщения");
  }

  @Test
  public void testSentMessageReturnTrue() {
    boolean result = mailbox.sentMessage(this.message);
    assertThat(true, is(result));
  }

  @Test
  public void testAcceptMessage() {
    boolean result = mailbox.acceptMessage(this.message);
    assertThat(true, is(result));
  }

  @Test
  public void testRemoveSentMessage() {
    mailbox.sentMessage(this.message);
    boolean result = mailbox.removeSentMessage();
    assertThat(true, is(result));
  }

  @Test
  public void testRemoveIncomingMessage() {
    mailbox.acceptMessage(this.message);
    boolean result = mailbox.removeIncomingMessage();
    assertThat(true, is(result));
  }

  @Test
  public void testFullSentFolder() {
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    mailbox.sentMessage(this.message);
    boolean result = mailbox.sentMessage(this.message);
    assertThat(false, is(result));
  }

  @Test
  public void testFullIncomingFolder() {
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    mailbox.acceptMessage(this.message);
    boolean result = mailbox.acceptMessage(this.message);
    assertThat(false, is(result));
  }
}
