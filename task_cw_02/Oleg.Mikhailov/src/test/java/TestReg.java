import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestReg {

  @Test
  public void testCount() {
    String str = "d85a:///bc:ca sdflkasjdf asdfasdf qw a85a:///bc:c";

    int count = Regular.count(str);
    assertThat(count, is(2));
  }

}
