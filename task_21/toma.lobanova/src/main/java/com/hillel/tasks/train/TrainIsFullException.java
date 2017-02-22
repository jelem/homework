package com.hillel.tasks.train;

public class TrainIsFullException extends RuntimeException {
  public TrainIsFullException(String message) {
    super(message);
  }
}
