package Task_2;

public class Headphones {

  private static final int MAX_VOLUME = 100;
  private static final int MIN_VOLUME = 0;
  private static final int MAX_NUMBER_OF_TURN_WHEEL = 10;
  private static final int MIN_NUMBER_OF_TURN_WHEEL = 0;

  private int volume;
  private boolean connect;
  private int numberOfTurnWheel;


  public void connecting() {
    connect = true;
    System.out.println("connecting is "+ connect);
  }

  public void disconecting() {
    connect = false;
    System.out.println("connecting is "+ connect);
  }



  public void turnWheelUp() {
    numberOfTurnWheel++;
    if (numberOfTurnWheel > MAX_NUMBER_OF_TURN_WHEEL) {
      numberOfTurnWheel = MAX_NUMBER_OF_TURN_WHEEL;
    }
    System.out.println("Number of Turn wheel = "+ numberOfTurnWheel);
  }

  public void turnWheelDown() {
    numberOfTurnWheel--;
    if (numberOfTurnWheel < MIN_NUMBER_OF_TURN_WHEEL) {
      numberOfTurnWheel = MIN_NUMBER_OF_TURN_WHEEL;
    }
    System.out.println("Number of Turn wheel = "+ numberOfTurnWheel);
  }

  public void Volume() {
    if (volume > MAX_VOLUME) {
      System.out.println("Volume is Maximum");
      return;
    }
    if (volume < MIN_VOLUME) {
      System.out.println("Volume is Minimum");
      return;
    }

    switch (numberOfTurnWheel) {
      case 0:
        volume = 0;
        break;
      case 1:
        volume = 10;
        break;
      case 2:
        volume = 20;
        break;
      case 3:
        volume = 30;
        break;
      case 4:
        volume = 40;
        break;
      case 5:
        volume = 50;
        break;
      case 6:
        volume = 60;
        break;
      case 7:
        volume = 70;
        break;
      case 8:
        volume = 80;
        break;
      case 9:
        volume = 90;
        break;
      case 10:
        volume = 100;
        break;
    }
    System.out.println("volume = "+ volume);
  }

  public int getVolume() {
    return volume;
  }

  public boolean getConnect() {
    return connect;
  }

  public int getNumberOfTurnWheel() {
    return numberOfTurnWheel;
  }
}

