package mailbox;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MessageTest {

  private Message message;

  @Before
  public void setUp() {
    this.message = new Message();
  }

  @Test
  public void testSetId() {
    message.setId(1);
    assertThat(1, is(message.getId()));
  }

  @Test
  public void testSetTitle() {
    message.setTitle("Новый титл");
    assertThat("Новый титл", is(message.getTitle()));
  }

  @Test
  public void testSetText() {
    message.setText("Новый текст к этому письму");
    assertThat("Новый текст к этому письму", is(message.getText()));
  }
}
