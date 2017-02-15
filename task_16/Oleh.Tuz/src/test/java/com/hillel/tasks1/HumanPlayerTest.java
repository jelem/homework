package com.hillel.tasks1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

/**
 * Created by TUZ on 13.02.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class HumanPlayerTest {

  @Mock
  ConsoleReader consoleReader;

  @Test
  public void testMakeMove(){

    when(consoleReader.getData()).thenReturn("12");

    HumanPlayer humanPlayer = new HumanPlayer("John","Wick", 51, 'X', consoleReader);

    String result= humanPlayer.makeMove();
    assertThat(result.length(), is(2));
  }
  private class ConsoleReaderMock implements ConsoleReader{

    @Override
    public String getData() {
      return "01";
    }
  }



}
