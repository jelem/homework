import com.hillel.tasks.StringTasks;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringTasksTest {
  StringTasks tasks;

  @Before
  public void setUp() {
    tasks = new StringTasks();
  }

  @Test
  public void testReplaceEmail() {
    String email = "person@gmail.com";
    assertThat(tasks.replaceEmail(email), is("person[ at ]gmail[ dot ]com"));
  }

  @Test
  public void testShortenWords() {
    String sentence = "    internationalization localization cat elephant monitor";
    assertThat(tasks.shortenWords(sentence), is("i18n l10n cat e6t m5r"));
  }

  @Test
  public void testCountPalindromes() {
    String words = "deleveled, evitative, cat, dog, deified";
    assertThat(tasks.countPalindromes(words), is(3));
  }

  @Test
  public void testBinaryToDecimal() {
    String number = "1010";
    assertThat(tasks.binaryToDecimal(number), is(10));
  }
}
