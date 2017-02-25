package com.hillel.tasks.train;

public class PlaceIsBusyException extends RuntimeException {
  public PlaceIsBusyException(String message) {
    super(message);
  }
}
