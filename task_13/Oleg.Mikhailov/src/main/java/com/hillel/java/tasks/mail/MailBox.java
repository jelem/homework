package com.hillel.java.tasks.mail;

import java.util.Arrays;

public class MailBox {

  private Message[] input;
  private Message[] output;
  private int countInput;
  private int countOutput;
  private static final int MAX_MESSAGE = 100;

  public MailBox() {
    this.countOutput = 0;
    this.countInput = 0;
    this.input = new Message[MAX_MESSAGE];
    this.output = new Message[MAX_MESSAGE];
  }

  public void getInputMessages(Message message) {
    if (countInput == MAX_MESSAGE) {
      System.out.println("Limit message!");
      return;
    }
    this.input[countInput] = message;
    countInput++;
  }

  public void deleteInputMessages() {
    if (countInput == 0) {
      System.out.println("MailBox is empty!");
      return;
    }
    countInput--;
    this.input[countInput] = null;
  }


  public void getOutputMessages(Message message) {
    if (countOutput == MAX_MESSAGE) {
      System.out.println("Limit message!");
      return;
    }
    this.output[countOutput] = message;
    countOutput++;
  }

  public void deleteOutputMessages() {
    if (countInput == 0) {
      System.out.println("MailBox is empty!");
      return;
    }
    countOutput--;
    this.output[countOutput] = null;
  }

  public int getCountInput() {
    return countInput;
  }

  public Message getFirstInput() {
    return input[0];
  }

  public static int getMaxMessage() {
    return MAX_MESSAGE;
  }

  public String viewInputMessage() {
    return Arrays.toString(input);
  }

  public String viewOutpuMessage() {
    return Arrays.toString(output);
  }
}
