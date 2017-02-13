package com.hillel.tasks;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class TicTacToeTest {

  Game game;

  @Mock
  Player playerOne;

  @Mock
  Player playerToo;

  @Before
  public void setUp() {
    game = new Game(playerOne, playerToo);
  }

  @Test
  public void testGame() {
    assertThat(game.lot(8), is(true));
  }

}
