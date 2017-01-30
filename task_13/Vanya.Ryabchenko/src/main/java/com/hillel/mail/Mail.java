package com.hillel.mail;

public class Mail {

  private static final int MAX_LETTERS = 10;
  private Letter[] input;
  private Letter[] output;
  private int counterInput;
  private int counterOutput;

  public Mail() {
    this.input = new Letter[MAX_LETTERS];
    this.output = new Letter[MAX_LETTERS];
    this.counterInput = 0;
    this.counterOutput = 0;
  }

  public void addInputLetter(Letter letter) {
    if (counterInput == MAX_LETTERS) {
      System.out.println("Mail Full");
    } else {
      this.input[counterInput] = letter;
      counterInput++;
    }
  }

  public void removeInputLetter() {
    if (counterInput == 0) {
      System.out.println("Mail empty");
    } else {
      this.input[counterInput] = null;
      counterInput--;
    }
  }

  public void addOutputLetter(Letter letter) {
    if (counterOutput == MAX_LETTERS) {
      System.out.println("Mail Full");
    } else {
      this.output[counterOutput] = letter;
      counterOutput++;
    }
  }

  public void removeOutputLetter() {
    if (counterOutput == 0) {
      System.out.println("Mail empty");
    } else {
      this.output[counterOutput] = null;
      counterOutput--;
    }
  }

}
