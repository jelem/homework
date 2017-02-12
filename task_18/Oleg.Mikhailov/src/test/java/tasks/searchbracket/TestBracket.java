package tasks.searchbracket;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Test;

public class TestBracket {

  private SearchBct searchBct;

  @Before
  public void setUp() {
    searchBct = new SearchBct();
  }

  @Test
  public void testCorrect() {
    String item1 = "((({}()[])))";
    assertThat(searchBct.correctInputBct(item1), is(true));
    String item2 = "{([])}";
    assertThat(searchBct.correctInputBct(item2), is(true));
  }

  @Test
  public void testIncorrect() {
    String item = "(({)})";
    assertThat(searchBct.correctInputBct(item), is(true));
  }

}
