package com.hillel.tasks;

public abstract class Field {

  abstract void initField();

  abstract void printGameField();

  abstract void setMovInField(char playerChar, Player player);

  abstract void setCarentMove(boolean carentMove);

  abstract boolean isCarentMove();

  abstract boolean winnerChack(Player player);

  abstract boolean allFieadFilled();
}
