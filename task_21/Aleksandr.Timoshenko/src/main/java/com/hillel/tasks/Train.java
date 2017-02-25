package com.hillel.tasks;

public class Train {

  private static final int MAX_SEATS_NUMBERS = 36;

  private int numbersOfCarriage;
  private String[][] carriage;
  private int numberSoldTickets;

  public Train(int numbersOfCarriage) {
    this.numbersOfCarriage = numbersOfCarriage;
    numberSoldTickets = 0;
    carriage = new String[this.numbersOfCarriage][MAX_SEATS_NUMBERS];
    for (int i = 0; i < this.numbersOfCarriage; i++) {
      for (int j = 0; j < MAX_SEATS_NUMBERS; j++) {
        carriage[i][j] = "In stock";
      }
    }
  }

  public boolean isTicketInStock(int carriageNumber, int seatsNumber) {
    if (carriageNumber > numbersOfCarriage | carriageNumber < 0 | seatsNumber > MAX_SEATS_NUMBERS
        | seatsNumber < 0) {
      throw new IndexOutOfBoundsException("Incorrect input");
    }
    return carriage[carriageNumber][seatsNumber].equals("In stock");
  }


  public void soldTicket(int carriageNumber, int seatsNumber)
      throws NoTicketException {
    if (isTicketInStock(carriageNumber, seatsNumber)) {
      carriage[carriageNumber][seatsNumber] = "Sold";
      numberSoldTickets++;
      printTicket(carriageNumber, seatsNumber);
    } else {
      throw new NoTicketException("Ticket sold");
    }
  }

  public void printCarriage(int carrigeNumber) {
    try {
      System.out.println();
      for (int i = 0; i < MAX_SEATS_NUMBERS; i++) {
        if (i % 5 == 0) {
          System.out.println();
        }
        System.out.print("Sits " + (i + 1) + " " + carriage[carrigeNumber][i] + "|");

      }
      System.out.println();
    } catch (IndexOutOfBoundsException message) {
      System.out.println("Incorrect input");
    }
  }

  public void printTrain() {
    for (int i = 0; i < numbersOfCarriage; i++) {
      System.out.println();
      System.out.println("Carriage " + (i + 1));
      for (int j = 0; j < MAX_SEATS_NUMBERS; j++) {
        if (j % 5 == 0) {
          System.out.println();
        }
        System.out.print("Sits " + (j + 1) + " " + carriage[i][j] + "|");
      }
      System.out.println();
    }
  }

  private void printTicket(int carriageNumber, int seatsNumber) {
    System.out.println();
    System.out.println(
        "Your carriage number is " + carriageNumber + " your seate place is " + seatsNumber);
  }

  public int getNumberSoldTickets() {
    return numberSoldTickets;
  }

}
